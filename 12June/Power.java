public class Power{
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(powerCalc(a,b));
    }
    public static int powerCalc(int a, int b){
        if(b==0){
            return 1;
        }
        return a*powerCalc(a, b-1);
    }
}