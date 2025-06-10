import java.util.HashMap;
import java.util.Map;

public class MaximumDifference3442{
    public static void main(String[] args) {
        String s="aaaaabbc";;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        int evenMax=Integer.MAX_VALUE;
        int oddMax=Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if(entry.getValue()%2==0&&entry.getValue()!=0){
                evenMax=Math.min(evenMax, entry.getValue());
            }
            else{
                oddMax=Math.max(oddMax, entry.getValue());
            }
        }
        int ans=(oddMax-evenMax);
        System.out.println(ans);
    }
}