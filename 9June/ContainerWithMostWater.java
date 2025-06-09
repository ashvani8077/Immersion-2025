public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        int max=0;
        int left=0;
        int leftMax=arr[left];
        int right=arr.length-1;
        int rightMax=arr[right];
        while (left<=right) {
            if(arr[left]>leftMax){
                leftMax=arr[left];
            }
            if(arr[right]>rightMax){
                rightMax=arr[right];
            }
            int water=Math.min(leftMax, rightMax)*(right-left);
            max=Math.max(max,water);
            if(leftMax<rightMax){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max);
    }
}
