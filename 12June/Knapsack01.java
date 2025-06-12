public class Knapsack01 {
    public static void main(String[] args) {
        int weight[] = {4, 5, 1};
        int cost[] = {1, 2, 3};
        int w = 4;
        int n = weight.length;
        System.out.println(knapsack(weight, cost, w, n));
    }

    public static int knapsack(int weight[], int cost[], int w, int n) {
        if (w == 0 || n == 0) {
            return 0;
        }

        if (weight[n - 1] <= w) {
            return Math.max(
                cost[n - 1] + knapsack(weight, cost, w - weight[n - 1], n - 1),
                knapsack(weight, cost, w, n - 1)
            );
        } else {
            return knapsack(weight, cost, w, n - 1);
        }
    }
}
