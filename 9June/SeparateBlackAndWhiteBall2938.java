public class SeparateBlackAndWhiteBall2938 {
    public static void main(String[] args) {
        String s="1010100";
        long ans=0;
        long count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans=ans+count;
            }
            else if(s.charAt(i)=='0'){
                count++;
            }
        }
        System.out.println(ans);
    }
}
