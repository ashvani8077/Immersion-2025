import java.util.HashMap;

public class TwoSumHashmap {
    public static void main(String[] args) {
        int arr[]={7,8,0,1,5,3};
        int target=4;
        int ans[]={-1,-1};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int store=target-arr[i];
            if(mp.containsKey(store)){
                ans[0]=mp.get(store);
                ans[1]=i;
            }
            else{
                mp.put(arr[i], i);
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
    }
}
