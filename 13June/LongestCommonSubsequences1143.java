public class LongestCommonSubsequences1143{
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        // System.out.println(lcsRecursive(s1, s2, s1.length(), s2.length()));


    }

    // public static int lcsRecursive(String s1,String s2,int i,int j){
    //     if(i==0||j==0){
    //         return 0;
    //     }
    //     if(s1.charAt(i-1)==s2.charAt(j-1)){
    //         return 1+lcsRecursive(s1,s2,i-1,j-1);
    //     }
    //     else {
    //         return Math.max(
    //             lcsRecursive(s1, s2, i-1, j),
    //             lcsRecursive(s1, s2, i, j-1)
    //         );
    //     }
    // }

    

}