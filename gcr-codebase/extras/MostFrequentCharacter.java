import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char maxChar='\0';
        int maxFreq=0;
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxChar= entry.getKey();
            }
        }
        System.out.println("Most Frequent Character: "+maxChar);
    }
}
