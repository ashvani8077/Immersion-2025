import java.util.*;

public class DominosePizza {
    static class Pair {
        int time;
        int value;

        public Pair(int time, int value) {
            this.time = time;
            this.value = value;
        }
    }

    public static List<Integer> solve(List<List<Integer>> arr) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.time - b.time);
        int k = 1;
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> temp = arr.get(i);
            pq.add(new Pair(temp.get(0) + temp.get(1), k++));
        }
        while (!pq.isEmpty()) {
            ans.add(pq.poll().value);
        }
        return ans;

    }

}
