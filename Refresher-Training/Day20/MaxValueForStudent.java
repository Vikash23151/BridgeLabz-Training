import java.util.*;

public class MaxValueForStudent
{
	public static void main(String[] args) {
	    //Maximum Value for Each Student
	    Scanner sc=new Scanner(System.in);
	    System.out.println("number of students");
	    int n=sc.nextInt(); //7
	    System.out.println("number of positions");
	    int m=sc.nextInt(); //2
	    System.out.println("enter the positions");
	    int[] pos=new int[m];   //2,5
	    for(int i=0;i<m;i++){
	        pos[i]=sc.nextInt();
	    }
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    for(int p:pos){
	        if(p>max) max=p;
	        if(p<min) min=p;
	    }
	    int[] ans=new int[n];
	    for(int i=0;i<n;i++){
	        ans[i]=Math.max(Math.abs(max-i),Math.abs(min-i));
	    }
	    for(int a:ans){
	        System.out.print(a+" "); //5 4 3 2 2 3 4
	    }
	    
	}
	
}