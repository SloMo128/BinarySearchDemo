public class BinarySearch {

    /**
     * Performs a binary search on a sorted array.
     *
     * @param a     the sorted array to search
     * @param low   the starting index of the subarray
     * @param high  the ending index of the subarray
     * @param value the value to search for
     * @return the index of the value if found, otherwise -1
     */
    public static int search(int[] a, int low, int high, int value) {

        // Base case: search space is valid
        if (low <= high) {

            // Find the middle index
            int mid = (low + high) / 2;

            // Check if the middle element is the target
            if (a[mid] == value) {
                return mid;
            }

            // If the target is greater, search in the right half
            else if (a[mid] < value) {
                return search(a, mid + 1, high, value);
            }

            // If the target is smaller, search in the left half
            else {
                return search(a, low, mid - 1, value);
            }
        }

        // Value not found
        return -1;
    }
}
