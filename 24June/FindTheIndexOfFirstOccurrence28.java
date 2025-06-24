public class FindTheIndexOfFirstOccurrence28 {
    public static void main(String[] args) {
        int ind = -1;
        String s = "sadbutsad";
        String t = "sad";

        for (int i = 0; i <= s.length() - t.length(); i++) {
            boolean found = true;

            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                ind = i;
                break; // first occurrence, so break
            }
        }

        System.out.println(ind);
    }
}
