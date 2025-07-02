import java.util.HashMap;

public class FindTheOriginalString3330 {
    public static void main(String[] args) {
        String s="abbcccc";
        int counter=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
                if(i!=0)map.remove(s.charAt(i-1));
            }
            else counter++;
        }
        System.out.println(counter+1);
    }
}
