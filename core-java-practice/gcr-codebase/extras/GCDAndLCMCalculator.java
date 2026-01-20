import java.util.Scanner;
public class GCDAndLCMCalculator {
  //GCD
  static int gcd(int n1,int n2){
    while(n2!=0){
      int rem = n1%n2;
      n1=n2;
      n2=rem;
    }
    return n1;
  }
  
  //LCM
  static int lcm(int n1,int n2, int gc){
    return(n1*n2)/gc;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2=sc.nextInt();
    int greatestCommonDivisor=gcd(n1,n2);
    System.out.println("GCD: "+greatestCommonDivisor);
    System.out.println("LCM: "+lcm(n1,n2,greatestCommonDivisor));
    sc.close();
  }
}
