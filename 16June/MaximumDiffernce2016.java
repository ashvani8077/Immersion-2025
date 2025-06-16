public class MaximumDiffernce2016{
    public static void main(String[] args) {
        int arr[]={7,1,5,4};
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<j&&arr[i]<arr[j]){
                    ans=Math.max(ans,arr[j]-arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}