import java.util.Scanner;

public class PalindromeStringCheck {
    static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        boolean palindrome=isPalindrome(str);
        if(palindrome){
            System.out.println("String is a Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }

    }
}
