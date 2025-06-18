import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {
        int g[]={1,2,3};
        int s[]={1,1};
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int i=0,j=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                ans+=1;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(ans);
    }
}
