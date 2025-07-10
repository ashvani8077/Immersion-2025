public class FindThePowerOfSubarray3254 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,5};
        int k=3;
        int ans[]=new int[arr.length-k+1];
        int m=0;
        int i=0;
        int j=k-1;
        while (j<arr.length) {
            int max=arr[i];
            for(int t=i;t<=j;t++){
                max = Math.max(max, arr[t]);
            }
            ans[m++]=max;
            i++;
            j++;
        }
        for(int a:ans){
            System.out.print(a+"  ");
        }
    }
}
