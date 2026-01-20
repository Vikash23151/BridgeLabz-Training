import java.util.Scanner;

public class RemoveSpecificCharacterFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Enter the Character to remove: ");
        char ch=sc.next().charAt(0);
        StringBuilder s=new StringBuilder();
        for(char c:str.toCharArray()){
            if(ch!=c) s.append(c);
        }
        System.out.println("Modified String: "+s.toString());
    }
}
