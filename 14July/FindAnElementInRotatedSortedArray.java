public class FindAnElementInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == key) {
                ans = mid;
                break;
            }

            if (arr[i] <= arr[mid]) {
                if (arr[i] <= key && key < arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (arr[mid] < key && key <= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        if (ans != -1)
            System.out.println("Element found at index: " + ans);
        else
            System.out.println("Element not found.");
    }
}
