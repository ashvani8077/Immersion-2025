public class TwoSum{
    public static void main(String[] args) {
        int arr[]={7,8,0,1,5,3};
        int target=4;
        int ans[]={-1,-1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
    }
}