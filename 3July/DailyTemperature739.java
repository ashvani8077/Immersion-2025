import java.util.Stack;

public class DailyTemperature739 {
    public static void main(String[] args) {
        int arr[]={73,74,75,71,69,72,76,73};
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
