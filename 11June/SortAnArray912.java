public class SortAnArray912 {
    public static void main(String[] args) {
        int arr[]={5,2,3,1};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void divide(int arr[], int i, int j){
        if(i<j){
            int mid=(i+j)/2;
            divide(arr, i, mid);
            divide(arr, mid+1, j);
            merge(arr, i, mid, j);
        }
    }

    public static void merge(int arr[], int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
