import java.util.Scanner;

public class CompareTwoStrings {
    static String compare(String s1, String s2){
        int len=Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)<s2.charAt(i)){
                    return s1;
                }else{
                    return s2;
                }
            }
        }
        return s1.length()==s2.length()?"equal":s1.length()<s2.length()?s1:s2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two String: ");
        String string1=sc.next();
        String string2=sc.next();
        String first=compare(string1,string2);
        if(first.equals("equal")){
            System.out.println("Both strings are equal");
        }else if(first.equals(string1)){
            System.out.println(first+" comes before "+string2+" in lexicographical order");
        }else{
            System.out.println(first+" comes before "+string1+" in lexicographical order");
        }
    }
}
