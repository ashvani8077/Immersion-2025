import java.util.*;
public class ArraySumOfElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(sumOfElement(arr, n));
    }
    public static int sumOfElement(int arr[],int n){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}