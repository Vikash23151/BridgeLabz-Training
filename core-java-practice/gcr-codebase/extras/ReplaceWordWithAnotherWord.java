import java.util.Scanner;

public class ReplaceWordWithAnotherWord {
    static String replaceWord(String sentence, String oldWord, String newWord){
        String[] words=sentence.trim().split("\\s+");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(oldWord)){
                words[i]=newWord;
            }
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence=sc.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord=sc.next();
        System.out.print("Enter the new word: ");
        String newWord=sc.next();
        String newSentence=replaceWord(sentence,oldWord,newWord);
        System.out.println("Sentence after modification: "+newSentence);
    }
}
