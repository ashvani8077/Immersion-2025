package AmazonAlgoQuestions;
import java.util.Scanner;
import java.util.*;

public class kthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(brute( n, arr, k));
        }

    }

    public static int brute( int n, int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static int better(int n,int arr[], int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int num:arr){
            pq.offer(num);
        }
        while (k!=1) {
            pq.remove();
            k--;
        }
        return pq.remove();
    }
    
}