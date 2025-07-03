import java.util.Stack;

public class NextGreatestNumber{
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int ans[]=brute(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    public static int[]brute(int arr[]){
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
                
            }
        }
        return ans;
    }


    public static int[]better(int arr[]){
        int ans[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty()&&st.peek()<=arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }

}