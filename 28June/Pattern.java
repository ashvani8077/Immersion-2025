public class Pattern{
    public static void main(String[] args) {
        int n=4;
        int l=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
                l=j;
            }
            for(int j=l-1;j>=1;j--){
                System.out.print(j);
            }
            for(int k=1;k<=n;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}