import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        StringBuilder s=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
        for(char c:str.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                s.append(c);
            }
        }
        System.out.println("String without duplicates: "+s.toString());
    }
}
