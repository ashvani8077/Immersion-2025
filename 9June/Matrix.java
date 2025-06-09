public class Matrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };
        int p1=0, p2=0,p3=0,p4=0;

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    continue;
                }
                else if(i<j&&i+j<n-1){
                    p1+=arr[i][j];
                }
                else if(i<j&&i+j>n-1){
                    p2+=arr[i][j];
                }
                else if(i>j&&i+j>n-1){
                    p3+=arr[i][j];
                }
                else{
                    p4+=arr[i][j];
                }
            }
        }
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);
        System.out.println("p3: "+p3);
        System.out.println("p4: "+p4);
    }
}
