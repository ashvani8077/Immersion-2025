package AmazonAlgoQuestions;

public class SquareRoot {
    public static void main(String[] args) {
        int t=25;
    }

    public static int brute(int t){
        int i=0;
        while(i*i<=t){
            i++;
        }
        return i-1;
    }


    public static int better(int t){
        return (int)Math.floor(Math.sqrt(t));
    }


    public static int optimal(int t){
        if(t==0||t==1)return t;
        int i=1;
        int j=t;
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid<=t/2){
                ans=mid;
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return ans;
    }
}
