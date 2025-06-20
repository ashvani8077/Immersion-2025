import java.util.HashSet;

public class StringCombination{
    public static void main(String[] args) {
        String s="abc";
        HashSet<String>hs=new HashSet<>();
        combination(s, 0,hs,"");
        for(String t:hs){
            System.out.println(t);
        }
    }
    public static void combination(String s, int idx,HashSet<String>hs,String ans){
        if(idx==s.length()){
            hs.add(ans);
            return;
        }
        combination(s, idx+1,hs,ans+s.charAt(idx));

        combination(s, idx+1, hs, ans);
    }
}