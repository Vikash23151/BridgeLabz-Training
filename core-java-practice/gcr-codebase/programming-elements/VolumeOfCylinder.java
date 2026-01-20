import java.util.Scanner;

public class VolumeOfCylinder{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius=sc.nextInt();
        System.out.println("Enter height: ");
        int height=sc.nextInt();
        double volume=3.14*radius*radius*height;
        System.out.println("Volume of Cylinder: "+volume);
    }
}
