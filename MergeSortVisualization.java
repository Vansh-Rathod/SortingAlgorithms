import java.util.Arrays;

public class MergeSortVisualization {

    static void merge(int[] arr, int start, int mid, int end) {
        int n = mid - start + 1; // size of left subarray
        int m = end - mid; // size of right subarray

        System.out.println("start = " + start + ", mid = " + mid + ", end = " + end);
        System.out.println("n(left) = " + n + ", m(right) = " + m);

        // creating new arrays
        int[] left = new int[n];
        int[] right = new int[m];

        for (int i = 0; i < n; i++) { // copying elements left subarray to new array
            left[i] = arr[i + start];
        }
        for (int j = 0; j < m; j++) { // copying elements right subarray to new array
            right[j] = arr[mid + 1 + j];
        }

        System.out.println("Left Array : " + Arrays.toString(left) + ", Right Array : " + Arrays.toString(right));

        int i = 0, j = 0, k = start;

        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else if (left[i] > right[j]) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = right[j];
            j++;
            k++;
        }

        System.out.println("After Sorting Two Sub-Arrays : " + Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            System.out.println("ms(arr, " + start + ", " + mid + ")");
            mergeSort(arr, start, mid);
            System.out.println("Return");

            System.out.println("-----------------------------------------------------");

            System.out.println("ms(arr, " + (mid + 1) + ", " + end + ")");
            mergeSort(arr, mid + 1, end);
            System.out.println("Return 2");

            System.out.println("-----------------------------------------------------");

            System.out.println("merge(arr, " + start + ", " + mid + ", " + end + ")");
            merge(arr, start, mid, end);
            System.out.println("Return 3");

            System.out.println("-----------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 24, 10, 1 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}