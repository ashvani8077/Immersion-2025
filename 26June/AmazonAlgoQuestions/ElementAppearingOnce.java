package AmazonAlgoQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ElementAppearingOnce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static int brute(int arr[], int n){
        Arrays.sort(arr);
        int freq[]=new int[1000001];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                return i;
            }
        }
        return -1;
    }


    public static int better(int arr[], int n){
        Arrays.sort(arr);

        if(n==1||arr[0]!=arr[1]){
            return arr[0];
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        return -1;
    }

    public static int optimal(int arr[], int n){
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0 )+1 );
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return-1;
    }
}
