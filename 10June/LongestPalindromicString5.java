public class LongestPalindromicString5{
    public static void main(String[] args) {
        String s="babad";
        String ans="";
        for(int i=0;i<s.length();i++){
            String s1=helper(s, i, i+1);
            String s2=helper(s, i, i);
            if(s1.length()>s2.length()&&s1.length()>ans.length()){
                ans=s1;
            }
            if(s2.length()>s1.length()&&s2.length()>ans.length()){
                ans=s2;
            }
        }
        System.out.println(ans);
    }  
    public static String helper(String s, int left, int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}