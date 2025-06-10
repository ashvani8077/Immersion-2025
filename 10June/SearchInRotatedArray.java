public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int ans=0;
        int left=0;
        int right=arr.length-1;
        while (left<=right) {
            int mid=(right-left);
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            if(arr[left]<arr[mid]){
                if(arr[left]<=target&&target<=arr[mid]){
                    right=mid-1;
                }
                else{
                    left=left+1;
                }
            }
            else{
                if(arr[mid]<=target&&target<=arr[right]){
                    left=mid+1;
                }
                else{
                    right=right-1;
                }
            }
        }
        System.out.println(ans);
    }
}
