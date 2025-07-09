import java.util.HashMap;

public class PalindromicSubstring647{
    int count=0;
    public static void main(String[] args) {
        String s="aaa";
        PalindromicSubstring647 p=new PalindromicSubstring647();
        System.out.println(p.palindromic(s));
    }


    public  int palindromic(String s){
        for(int i=0;i<s.length();i++){
            expand(i, i, s);
            expand(i, i+1, s);
        }
        
        return count;
    }


    public  void expand(int i, int j, String s){
        while (i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)) {
            count ++;
            i--;
            j++;
            
        }
    }
}