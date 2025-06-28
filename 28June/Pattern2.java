public class Pattern2 {
    public static void main(String[] args) {
        int n=4;
        int l=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                l=j;
            }
            for(int sp=1;sp<(n*2)-(2*i);sp++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                l=j;
            }
            for(int sp=1;sp<(n*2)-(2*i);sp++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
