package scenario_based;

import java.util.Scanner;

public class FlipKey {
	static String cleanseAndInvert(String word) {
		if(word==null || word.length()<6) return "";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(!Character.isLetter(ch) || ch==' ') return "";
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			int even= (int) ch;
			if(even%2!=0) {
				sb.append((char) even);
			}
		}
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			if(i%2==0) {
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String word=sc.nextLine().trim().toLowerCase();
		String output=cleanseAndInvert(word);
		if(output.length()==0) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("The generated key is - "+output);
		}
		sc.close();
	}

}
