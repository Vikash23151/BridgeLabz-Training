import java.util.Scanner;

public class SortedArrayMerge {
    static  int[] mergeArray(int[] array1, int[] array2){
        int totalSize=array1.length+array2.length;
        int n=array1.length;
        int[] sortedArray=new int[totalSize];
        int i=0;
        int j=0;
        for(int k=0;k<totalSize;k++){
            if(i< array1.length && array1[i]<array2[j]){
                sortedArray[k]=array1[i++];
            }else{
                sortedArray[k]=array2[j++];
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the arrays: ");
        int size=sc.nextInt();
        int[] array1=new int[size];
        int[] array2=new int[size];
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<size;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<size;i++){
            array2[i]=sc.nextInt();
        }
        int[] mergedSortedArray=mergeArray(array1,array2);
        for(int i=0;i<mergedSortedArray.length;i++){
            System.out.print(mergedSortedArray[i]+" ");
        }
    }
}
