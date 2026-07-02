package day_11;

public class quick {

    // Quick Sort function
    static void quickSort(int[] arr, int left, int right) {

        // Base condition
        if (left < right) {

            // Find the pivot position
            int pIndex = partition(arr, left, right);

            // Sort left part
            quickSort(arr, left, pIndex - 1);

            // Sort right part
            quickSort(arr, pIndex + 1, right);
        }
    }

    // Partition function
    static int partition(int[] arr, int left, int right) {

        // Choose last element as pivot
        int pivot = arr[right];

        // Index of smaller element
        int i = left - 1;

        // Compare every element with pivot
        for (int j = left; j < right; j++) {

            if (arr[j] <= pivot) {

                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    // Print array
    static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 2, 7, 1, 3, 6, 5};

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}