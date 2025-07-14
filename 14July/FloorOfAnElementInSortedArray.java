public class FloorOfAnElementInSortedArray {
    public static void main(String[] args) {
        int arr[]={1, 2, 8, 10, 10, 12, 19};
        int x=0;
        int ans=-1;
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]<=x){
                i=mid+1;
                ans=mid;
            }
            else{
                j=mid-1;
            }
        }
        System.out.println(ans);
    }

    
}
