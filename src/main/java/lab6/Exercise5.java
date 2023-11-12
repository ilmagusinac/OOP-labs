package lab6;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

    // Returns index of x if it is present in arr[].
    int binarySearch(int[] arr, int x)
    {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[middle] == x)
                return middle;

            // If x greater, ignore left half
            if (arr[middle] < x)
                left = middle + 1;

                // If x is smaller, ignore right half
            else
                right = middle - 1;
        }

        // If we reach here, then element was not present
        return -1;
    }

    public static boolean search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Here you can test your binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Enter your searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = Exercise5.search(array, Integer.parseInt(searchedValue));
        System.out.println((result) ? ("Value " + searchedValue + " is in the array") : ("Value " + searchedValue + " is not in the array"));
    }
}
