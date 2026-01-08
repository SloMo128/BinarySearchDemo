import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchDemo {

    public static void main(String[] args) {

        // Generate a random array of 20 integers between 0 and 99
        int[] a = new Random().ints(20, 0, 100).toArray();

        // Sort the array because Binary Search requires a sorted array
        Arrays.sort(a);

        // Print the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(a));

        Scanner in = new Scanner(System.in);
        boolean done = false;

        // Interactive search loop
        while (!done) {

            System.out.print("Enter number to search for (-1 to quit): ");
            int n = in.nextInt();

            if (n == -1) {
                done = true;
            } else {

                // Perform binary search
                int pos = BinarySearch.search(a, 0, a.length - 1, n);

                // Check if the value was found
                if (pos >= 0) {
                    System.out.println("Found at position: " + pos);
                } else {
                    System.out.println("Value not found.");
                }
            }
        }

        in.close();
    }
}
