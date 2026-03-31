package scenario_based;

import java.util.HashSet;
import java.util.Scanner;

public class LexicalTwist {
	static boolean verify(String word) {
		if(word.contains(" ")) {
			System.out.println(word+" is an invalid word");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String first=sc.nextLine().trim();
		if(!verify(first)) return;
		System.out.print("Enter the second word: ");
		String second=sc.nextLine().trim();
		if(!verify(second)) return;
		StringBuilder sbb=new StringBuilder();
		for(int i=first.length()-1;i>=0;i--) {
			sbb.append(Character.toLowerCase(first.charAt(i)));
		}
		if(first.length()==second.length() && second.equalsIgnoreCase(sbb.toString())) {
				for(int i=0;i<first.length();i++) {
					char ch = sbb.charAt(i);
				    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				        sbb.setCharAt(i, '@');
				    }
				}
				System.out.println(sbb.toString());
				return;	
		}else {
			StringBuilder sb=new StringBuilder(first.toUpperCase());
			sb.append(second.toUpperCase());
			int vowels=0;
			int consonants=0;
			for(int i=0;i<sb.length();i++) {
				char ch = sb.charAt(i);
			    if (("AEIOU".indexOf(ch) != -1)) {
			        vowels++;
			    }else if(Character.isLetter(ch)){
			    	consonants++;
			    }
			}
			if(vowels==consonants) {
				System.out.println("Vowels and Consonants are equal");
			}else if(vowels>consonants) {
				HashSet<Character> set=new HashSet<>();
				for(int i=0;i<sb.length();i++) {
					char ch = sb.charAt(i);
				    if (("AEIOU".indexOf(ch) != -1) && set.add(ch) ) {
				        System.out.print(ch);
				        if(set.size()==2) break;
				    }
				}
			}else {
				HashSet<Character> set=new HashSet<>();
				for(int i=0;i<sb.length();i++) {
					char ch = sb.charAt(i);
				    if (!("AEIOU".indexOf(ch) != -1) && Character.isLetter(ch) && set.add(ch) ) {
				        System.out.print(ch);
				        if(set.size()==2) break;
				    }
				}
			}
		}
	}
}
	
