public class MaximumDifferenceAdjancenceArray3423{
    public static void main(String[] args) {
        int arr[]={-5,-10,-5};
        int n=arr.length;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=i%n;
            int b=(i+1)%n;
            int ans=Math.abs(arr[a]-arr[b]);
            sum=Math.max(sum,ans);
        }
        System.out.println(sum);
        String name=null;
        System.out.println(name);
        System.out.println(name.length());
    }
}