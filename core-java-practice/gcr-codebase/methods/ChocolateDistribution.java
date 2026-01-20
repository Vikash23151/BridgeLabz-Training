import java.util.Scanner;

public class ChocolateDistribution {
    static int[] findChocolateDistribution(int n, int m){
        int chocolatePerChild=n/m;
        int remainingChocolate=n%m;
        return new int[]{chocolatePerChild,remainingChocolate};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of chocolates & children: ");
        int numberOfChocolates=sc.nextInt();
        int numberOfChildren=sc.nextInt();
        int[] result=findChocolateDistribution(numberOfChocolates,numberOfChildren);
        System.out.println("Number of chocolate per child: "+result[0]+"\nRemaining Chocolates: "+result[1]);
    }
}
