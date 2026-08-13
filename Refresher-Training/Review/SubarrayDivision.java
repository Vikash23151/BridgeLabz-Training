/*
    problem statement: 
    Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an 
    integer on it. Lily decides to share a contiguous segment of the bar selected such that:
    The length of the segment matches Ron's birth month, and,
    The sum of the integers on the squares is equal to his birth day.
    Determine how many ways she can divide the chocolate.
*/
import java.util.*;

public class SubarrayDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        int result = birthday(s, d, m);
        System.out.println(result);
        int result2 = birthday1(s, d, m);
        System.out.println(result2);
        sc.close();
    }
    // brute force approach
    private static int birthday(List<Integer> s, int d, int m) {
        int pair = 0;
        int n = s.size();
        for (int i = 0; i <= n - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                pair++;
            }
        }
        return pair;
    }
    // sliding window approach
    private static int birthday1(List<Integer> s, int d, int m){
        int pair=0;
        int n=s.size();
        if(m>n) return 0;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=s.get(i);
        }
        if(sum==d) pair++;
        for(int i=m;i<n;i++){
            sum=sum+s.get(i)-s.get(i-m);
            if(sum==d) pair++;
        }
        return pair;
    }
}