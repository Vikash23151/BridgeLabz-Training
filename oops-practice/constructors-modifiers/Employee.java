class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        setSalary(salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }
}
class Manager extends Employee {
    private String level; // e.g., "Senior", "Team Lead"

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayManagerInfo() {
        // allowed: public + protected members from Employee
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        // allowed via public method
        System.out.println("Salary: " + getSalary());
        System.out.println("Level: " + level);
    }
}
class Main4 {
    public static void main(String[] args) {
        Manager m = new Manager(88, "IT", 75000, "Senior");
        m.displayManagerInfo();

        m.setSalary(80000);
        System.out.println("Updated salary: " + m.getSalary());
    }
}


