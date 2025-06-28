public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int topleft=1;
        int topRight=1;
        int bottomLeft=n-1;
        int bottomRight=n-1;
        int total=n*n;
        for(int i=1;i<=n;i++){
            for(int j=topleft;j<=topRight;j++){
                System.out.print(j);
                topRight++;
            }
            for(int j=topRight;j<=bottomRight;j++){
                System.out.print(j);
                bottomRight++;
            }
            for(int j=bottomRight;j<=bottomLeft;j++){
                System.out.print(j);
                bottomLeft++;
            }
            for(int j=bottomLeft;j<=topleft;j++){
                System.out.print(j);
                topleft++;
            }
            System.out.println();
        }
    }
}
