import java.util.*;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int [n];
        reverseArray(arr, temp);
        for(int i:temp){
            System.out.println(i);
        }
        sc.close();

    }
    public static void reverseArray(int arr[], int rev[]){
    int j = 0;
    for(int i = arr.length - 1; i >= 0; i--){
        rev[j++] = arr[i];
    }
}
}
