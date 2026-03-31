import java.util.Scanner;

public class Quadratic {
    static double[] findTheRoots(int a, int b, int c){
        /*
        delta = b^2 - 4*a*c
        If delta is positive the find the two roots using formulae
        root1 of x = (-b + sqrt(delta))/(2*a)
        root1 of x = (-b - sqrt(delta))/(2*a)
        If delta is zero then there is only one root of x
        root of x = -b/(2*a)
         */
        double delta=Math.pow(b,2)-(4*a*c);
        if(delta>0){
            double root1=(-b + Math.sqrt(delta))/(2*a);
            double root2=(-b - Math.sqrt(delta))/(2*a);
            return new double[]{root1,root2};
        }else if(delta==0.0){
            double root=-b/(2*a);
            return new double[]{root};
        }else{
            return new double[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // quadratic equation ax^2+ bx + c
        System.out.println("Enter a, b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double[] rootsArray=findTheRoots(a,b,c);
        if(rootsArray.length==2){
            System.out.println("Two roots are: "+rootsArray[0]+" and "+rootsArray[1]);
        }else if(rootsArray.length==1){
            System.out.println("The root is: "+rootsArray[0]);
        }else{
            System.out.println("No roots");
        }
    }
}
