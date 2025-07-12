public class SearchInsertPosition39{
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int t=5;
        solve(arr, t);
    }

    public static int solve(int arr[], int t){
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]>t){
                j=mid-1;
            }
            else if(arr[mid]<t){
                i=mid+1;
            }
            else{
                return mid;
            }
        }
        return i;
    }
}