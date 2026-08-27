import java.util.*;
public class SpecialString
{
	public static void main(String[] args) {
	    //Count Special Strings in Range Queries
	   // A string is called special if both its first and last characters are vowels (a, e, i, o, u),case-insensitive.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arr");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the words");
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		}
		int[] prefix=new int[n+1];
		for(int i=0;i<n;i++){
		    prefix[i+1]=prefix[i];
		    if(isSpecial(arr[i])){
		        prefix[i+1]++;
		    }
		}
		System.out.println("Enter the size of queries");
		int m=sc.nextInt();
		System.out.println("query is represented as a string in the format l-r.");
		List<String> queries=new ArrayList<>();
		for(int i=0;i<m;i++){
		    queries.add(sc.next());
		}
		List<Integer> ans=new ArrayList<>();
		for(String q:queries){
		    String[] indices=q.split("-");
		    int left=Integer.parseInt(indices[0])-1;
		    int right=Integer.parseInt(indices[1]);
		    int count=prefix[right]-prefix[left];
		    ans.add(count);
		}
		System.out.print("result: ");
		for(int i:ans){
		    System.out.print(i+" ");
		}
	}
	
	static boolean isSpecial(String sub){
	    return sub.matches("^[aeiouAEIOU].*[aeiouAEIOU]$");
	}
}