import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.next();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            }else{
                consonant++;
            }
        }
        System.out.println("Number of vowels: "+vowel);
        System.out.println("Number of consonants: "+consonant);
    }
}
