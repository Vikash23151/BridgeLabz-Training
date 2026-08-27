
public class LongestNonDecreasingSubstring
{
	public static void main(String[] args) {
	    //Longest Non-Decreasing Substring After Pair Swaps
	    String dataStream = "110000";
        System.out.println(
            longestNonDecreasing(dataStream)
        );
	}
	private static int longestNonDecreasing(String dataStream){
	    int n=dataStream.length();
	    int goodPair=0;
	    int badPair=0;
	    for(int i=0;i<n;i+=2){
	        String pair=""+dataStream.charAt(i)+dataStream.charAt(i+1);
	        if(pair.equals("10")){
	            badPair++;
	        }else{
	            goodPair++;
	        }
	    }
	    if(badPair==0){
	        return n;
	    }
	   return goodPair*2+1;
	    
	}
}