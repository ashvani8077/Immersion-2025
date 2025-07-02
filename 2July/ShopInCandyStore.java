import java.util.Arrays;

public class ShopInCandyStore{
    public static void main(String[] args) {
        int arr[]={3,2 ,1, 4, 5};
        int n=5;
        int k=4;
        int minCost=0;
        int maxCost=0;

        int n2=n;

        

        Arrays.sort(arr);
        //for min cost;
        int i=0;
        while(n>0&&i<arr.length){
            minCost+=arr[i];
            n--;
            i+=1;
            n-=k;
        }
        System.out.println(minCost);

        //for max cost
        int j=arr.length-1;
        while (n2>0&&j>=0) {
            maxCost+=arr[j];
            n2--;
            j-=1;
            n2-=k;
        }
        System.out.println(maxCost);
    }
}