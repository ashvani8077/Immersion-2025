package AmazonAlgoQuestions;

import java.util.Scanner;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int t=1;
        int n=5;
        int arr[]={0,0,0,1,1};
    }

    public static int brute(int n,int arr[]){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static int better(int n, int arr[]){
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]!=1){
                i=mid+1;
            }
            else{
                j=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}
