import java.util.PriorityQueue;

public class NearlySorted{
    public static void main(String[] args) {
        int arr[]={6, 5, 3, 2, 8, 10, 9};
        int k=3;
        sort(arr, k);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }

    public static void sort(int arr[], int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(pq.size()>k){
                arr[t++]=pq.poll();
            }
            pq.add(arr[i]);
        }
        while (pq.size()!=0) {
            arr[t++]=pq.poll();
        }
    }
}