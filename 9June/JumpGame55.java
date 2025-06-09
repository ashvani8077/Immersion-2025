public class JumpGame55 {
    public static void main(String[] args) {
        int arr[]={3,2,1,0,4};
        int max=0;
        int i=0;
        int n=arr.length;
        while (i<n) {
            if(i>max){
                System.out.println(false);
            }
            max=Math.max(max, i+arr[i]);
            i++;

        }
        System.out.println(true);
    }
}
