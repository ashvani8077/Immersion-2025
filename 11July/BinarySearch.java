public class BinarySearch {
    public static void main(String[] args) {
        int[] ascendingArr = {1, 3, 5, 7, 9, 11};
        int[] descendingArr = {20, 18, 16, 14, 12, 10};

        int target = 7;

        System.out.println("Ascending Search: Index = " + binarySearchAscending(ascendingArr, target));
        System.out.println("Descending Search: Index = " + binarySearchDescending(descendingArr, 14));
        System.out.println("Binary Search Both (Ascending): Index = " + binarySearchBoth(ascendingArr, 9));
        System.out.println("Binary Search Both (Descending): Index = " + binarySearchBoth(descendingArr, 18));
    }

    public static int binarySearchAscending(int arr[], int t) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchDescending(int arr[], int t) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] > t) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchBoth(int arr[], int t) {
        int i = 0;
        int j = arr.length - 1;

        boolean isAscending = arr[i] < arr[j];

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == t) {
                return mid;
            }

            if (isAscending) {
                if (arr[mid] < t) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            } else {
                if (arr[mid] > t) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}
