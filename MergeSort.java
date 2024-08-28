import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr, int start, int mid, int end) {
        int n = mid + 1 - start; // size of left sub array
        int m = end - mid; // size of right sub array

        // creating new sub arrays
        int[] left = new int[n];
        int[] right = new int[m];

        // copying the values from the original array to their respective sub arrays
        for (int i = 0; i < n; i++) { // copying values to left sub array
            left[i] = arr[start + i];
        }
        for (int j = 0; j < m; j++) { // copying values to right sub array
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else if (left[i] > right[j]) {
                arr[k++] = right[j++];
            }
        }

        while (i < n) { // if any values remaining in the left sub array then just copy all the values
                        // to the original array
            arr[k++] = left[i++];
        }
        while (j < m) {// if any values remaining in the right sub array then just copy all the values
                       // to the original array
            arr[k++] = right[j++];
        }

    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 24, 10, 1 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
