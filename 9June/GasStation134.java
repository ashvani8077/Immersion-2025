public class GasStation134 {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int totalCost=0;
        int totalGas=0;
        int currentGas=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
            currentGas=gas[i]-cost[i];
            if(currentGas<0){
                start=i+1;
                currentGas=0;
            }
        }
        if(totalGas<totalCost){
            System.out.println(-1);
        }
        else{
            System.out.println(start);
        }
    }
}
