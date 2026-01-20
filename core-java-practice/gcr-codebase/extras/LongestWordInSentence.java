import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence=sc.nextLine();
        String[] words=sentence.trim().split("\\s+");
        String longestWord=words[0];
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println("Longest word in the sentence: "+longestWord);
    }
}
