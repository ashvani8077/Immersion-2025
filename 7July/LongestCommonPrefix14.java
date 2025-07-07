import java.util.Arrays;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        
    }
    public static String solve(String s[]){
        StringBuilder sb=new StringBuilder();
        Arrays.sort(s);
        String a=s[0];
        String b=s[s.length-1];
        for(int i=0;i<Math.min(a.length(), b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return sb.toString();
            }
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }

}
