
public class FractionalKnapsack{
    public static void main(String[] args) {
        int val[]={60,100,120};
        int w[]={10,20,30};
        int capacity=50;
        double ratio[]=new double[val.length];
        for(int i=0;i<ratio.length;i++){
            ratio[i]=(double)val[i]/w[i];
        }
        for(int i=0;i<ratio.length-1;i++){
            int maxInd=i;
            for(int j=i+1;j<ratio.length;j++){
                if(ratio[j]>ratio[maxInd]){
                    maxInd=j;
                }
            }
            double tempRatio=ratio[i];
            ratio[i]=ratio[maxInd];
            ratio[maxInd]=tempRatio;


            int tempVal=val[i];
            val[i]=val[maxInd];
            val[maxInd]=tempVal;

            
            int tempW=w[i];
            w[i]=w[maxInd];
            w[maxInd]=tempW;


        }
        double totalProfit=0;
        for(int i=0;i<ratio.length;i++){
            if(capacity==0){
                break;
            }
            else if(w[i]<=capacity){
                capacity=capacity-w[i];
                totalProfit=totalProfit+val[i];
            }
            else{
                totalProfit = totalProfit + val[i] * ((double) capacity / w[i]);
                capacity=0;
            }
        }
        System.out.println(totalProfit);
    }
}