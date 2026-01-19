import java.util.Scanner;

public class LineComparisonProblem {
    static double inputAndLength(String line){
        //UC1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter point1 (x,y) of "+line+": ");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Enter point2 (x,y) of "+line+": ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

        double lengthOfLine=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return lengthOfLine;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program\n");
        double lengthOfLine1=inputAndLength("Line 1");
        double lengthOfLine2=inputAndLength("Line 2");

        //UC2
        if(lengthOfLine1==lengthOfLine2){
            System.out.printf("Two lines are equal %.2f = %.2f%n", lengthOfLine1, lengthOfLine2);
        }else{
            //UC3
            if(lengthOfLine1>lengthOfLine2){
                System.out.printf("Line 1 ( %.2f ) is greater than Line 2 ( %.2f )",lengthOfLine1,lengthOfLine2);
            }else{
                System.out.printf("Line 2 ( %.2f ) is greater than Line 1 ( %.2f )",lengthOfLine2,lengthOfLine1);
            }
        }

    }
}
