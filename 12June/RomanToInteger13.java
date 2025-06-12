import java.util.HashMap;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = roman.get(s.charAt(i));
            if (i + 1 < s.length() && curr < roman.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        return ans;
    }
}
