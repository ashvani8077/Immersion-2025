import java.util.Arrays;

public class MissingNumber268{
    public static void main(String[] args) {
        
    }
     public int missingNumber(int[] arr) {
               int num=0;
        Arrays.sort(arr);
        int i=0;
        for (i=0;i< arr.length;i++){
            if(arr[i]!=num){
                break;
            }
            else {
                num++;
            }
        }
        return num;
    }
}