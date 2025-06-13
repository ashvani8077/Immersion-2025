import java.util.*;
public class Pair {
    int element;
    int index;
    public Pair(int element, int index){
        this.element = element;
        this.index=index;
    }
    public static void main(String[] args) {
        char arr[]={10,12,5,24,3};
        Pair [] p=new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            p[i]=new Pair(arr[i], i);
        }
        for(Pair pair:p){
            System.out.println(pair.element+" "+pair.index);
        }
        System.out.println();
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].element+" "+p[i].index);
        }
        Arrays.sort(p,(a,b)->Integer.compare(a.element,b.element));
        System.out.println();
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].element+" "+p[i].index);
        }
        
        Arrays.sort(p,(a,b)->Integer.compare(a.index, b.index));
        System.out.println();
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].element+" "+p[i].index);
        }
    }
}
