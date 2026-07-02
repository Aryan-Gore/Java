package day_11;

public class MergeSort {

    // Function to divide the array into smaller parts
    static void mergeSort(int[] arr, int left, int right) {

        // Base condition: stop when only one element is left
        if (left < right) {

            // Find the middle index
            int mid = left + (right - left) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays
    static void merge(int[] arr, int left, int mid, int right) {

        // Size of left subarray
        int n1 = mid - left + 1;

        // Size of right subarray
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy elements into left temporary array
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        // Copy elements into right temporary array
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        // Initial indexes
        int i = 0;      // Left array index
        int j = 0;      // Right array index
        int k = left;   // Original array index

        // Compare elements of both arrays and copy the smaller one
        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of left array (if any)
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array (if any)
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Input array
        int[] arr = {8, 4, 2, 7, 1, 3, 6, 5};

        System.out.println("Original Array:");
        printArray(arr);

        // Cal
        // l Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}