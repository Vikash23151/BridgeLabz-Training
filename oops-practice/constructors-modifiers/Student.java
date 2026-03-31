public class Student {
    public int rollNo;
    protected String name;
    private double cgpa;

    Student(int rollNo, String name, double cgpa){
        this.rollNo=rollNo;
        this.name=name;
        setCgpa(cgpa);
    }
    public void setCgpa(double cgpa){
        if(cgpa<0.0 || cgpa>10.0){
            throw new IllegalArgumentException("Enter correct cgpa");
        }
        this.cgpa=cgpa;
    }
    public double getCgpa(){
        return cgpa;
    }
}
class PostgraduateStudent extends Student{
    private String specialization;
    PostgraduateStudent(int rollNo, String name, double cgpa,String specialization){
        super(rollNo, name, cgpa);
        this.specialization=specialization;
    }
    public void displayDetails(){
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCgpa());
        System.out.println("Spec: " + specialization);
    }
}
class Main {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(88, "Ryuga", 8.50, "AI");
        pg.displayDetails();

        pg.setCgpa(9.10);  // modifying private cgpa via public method
        System.out.println("Updated CGPA: " + pg.getCgpa());
    }
}
