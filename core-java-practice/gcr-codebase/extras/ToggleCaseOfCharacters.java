import java.util.Scanner;

public class ToggleCaseOfCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        StringBuilder s=new StringBuilder();
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                s.append(Character.toLowerCase(c));
            }else{
                s.append(Character.toUpperCase(c));
            }
        }
        System.out.println("After toggling the characters, the String: "+s.toString());
    }
}
