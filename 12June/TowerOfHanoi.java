public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 2;
        solve(n, 'S', 'A', 'D');
    }

    public static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Plate: " + n + " Moved " + source + " to " + destination);
            return;
        }

        solve(n - 1, source, destination, auxiliary);
        System.out.println("Plate: " + n + " Moved " + source + " to " + destination);
        solve(n - 1, auxiliary, source, destination);
    }
}
