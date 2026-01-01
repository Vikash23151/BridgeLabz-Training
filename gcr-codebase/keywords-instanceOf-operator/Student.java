import javax.xml.transform.Source;

public class Student {
    private static String universityName;
    private static int studentCount=0;
    private String name;
    private final int rollNumber;
    private String grade;

    Student(String name, int rollNumber, String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        studentCount++;
    }
    public static void displayTotalStudents(){
        System.out.println("Total number of students: "+studentCount);
    }
    public void displayDetails(){
        System.out.println("Student name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Grade: "+grade);
        System.out.println();
    }
    public void updateGrade(String grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student student=new Student("Ryuga",68,"A+");
        Student student2=new Student("awwtysm",88,"A");
        displayTotalStudents();
        if(student instanceof Student && student2 instanceof Student) {
            student.displayDetails();
            student2.displayDetails();
            student.updateGrade("O");
            student.displayDetails();
        }else{
            System.out.println("Object is not an instance of Student class");
        }
    }
}
