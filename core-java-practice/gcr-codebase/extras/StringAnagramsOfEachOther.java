import java.util.Scanner;

public class StringAnagramsOfEachOther {
    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int[] arr=new int[26];
        for(char c:s1.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:s2.toCharArray()){
            arr[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter both strings: ");
        String string1=sc.next().toLowerCase();
        String string2=sc.next().toLowerCase();
        boolean anagram=isAnagram(string1,string2);
        if(anagram){
            System.out.println("Both Strings are Anagram");
        }else{
            System.out.println("Both Strings are not Anagram");
        }
        sc.close();
    }
}
