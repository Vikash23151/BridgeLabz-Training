import java.util.*;

public class MaxFreq
{
	public static void main(String[] args) {
	    //Maximum-Frequency Character with Index Tie-BreakerN
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int[] freq=new int[128];
	    for(char c:s.toCharArray()){
	        freq[c]++;
	    }
	    int max=0;
	    for(int i=0;i<128;i++){
	        if(freq[i]>freq[max]){
	            max=i;
	        }
	    }
	    System.out.print("max frequency: "+(char) max);
	}
	
}