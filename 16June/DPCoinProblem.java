public class DPCoinProblem {
    public static void main(String[] args) {
        int n=18;
        System.out.println(minCoins(n));
    }
    public static int minCoins(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MAX_VALUE;
        }
        int use7=minCoins(n-7);
        if(use7!=Integer.MAX_VALUE){
            use7+=1;
        }
        int use5=minCoins(n-5);
        if(use5!=Integer.MAX_VALUE){
            use5+=1; 
        }
        int use1=minCoins(n-1);
        if(use1!=Integer.MAX_VALUE){
            use1+=1;
        }
        return Math.min(use7, Math.min(use5, use1));
    }
}
