import java.util.ArrayList;

public class JosephusProblem1823 {
    public static void main(String[] args) {
        int n=8;
        int k=3;
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        System.out.println(solution(li,0,k));
    }
    public static int solution(ArrayList<Integer>li, int idx, int k){
        if(li.size()==1){
            return li.get(0);
        }
        idx=(idx+(k-1))%li.size();
        li.remove(idx);
        return solution(li, idx, k);
    }
}
