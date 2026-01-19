import java.util.Scanner;

public class SubstringOccurances {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String & Substring: ");
        String string=sc.next();
        String substring=sc.next();
        int count=0;
        int index=0;
        while((index=string.indexOf(substring,index))!=-1){
            index++;
            count++;
        }
        System.out.println("Number of occurrences of "+substring+": "+count);
    }
}
