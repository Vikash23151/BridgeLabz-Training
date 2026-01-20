import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        StringBuilder s=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        System.out.println("Reversed String: "+s.toString());
    }
}
