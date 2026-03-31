public class Course {
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName="GLA";

    Course(String courseName, int duration, int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course duartion: "+duration+" months");
        System.out.println("Course fee: "+fee);
    }

    static void updateInstituteName(String updatedName){
        instituteName=updatedName;
    }

    public static void main(String[] args) {
        Course course=new Course("Ml",6,60000);
        course.displayCourseDetails();
        updateInstituteName("Gla University");
        System.out.println("Institute name: "+instituteName);
    }
}
