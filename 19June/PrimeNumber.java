public class PrimeNumber{
    public static void main(String[] args) {
        int n=100;
    }
    public static boolean isPrime(int n) {
        if(n==2)return true;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}