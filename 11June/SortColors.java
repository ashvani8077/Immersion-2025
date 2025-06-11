public class SortColors {
    public void sortColors(int[] arr) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else{
                arr[i]=2;
                two--;
            }
        }
    }
}