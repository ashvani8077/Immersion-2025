import java.util.*;
public class MaximumDifference3445 {
    public static void main(String[] args) {
        String s="12233";
        int k=4;
        int arr[]=new int [5];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'0']++;
        }
        int ans=0;
        int even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(arr[s.charAt(i)-'0']%2==0){
                even=Math.min(even, arr[s.charAt(i)-'0']);
            }
            else{
                odd=Math.max(odd, arr[s.charAt(i)-'0']);
            }
        }
        ans=odd-even;
        
    }
}
