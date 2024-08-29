import java.util.*;

public class QuickSortLastPivotVisualization {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        System.out.println("Swapped");
    }

    static int partition(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        System.out.println("PivotElement = " + pivotElement);

        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivotElement) {
                i++;
                swap(arr, i, j);
            }
        }
        System.out.println("Array after for loop : " + Arrays.toString(arr));
        System.out.println("Swapping Pivot");

        swap(arr, i + 1, end);

        System.out.println("Array after swapping pivot : " + Arrays.toString(arr));

        return (i + 1);
    }

    static void quickSort(int[] arr, int start, int end) {
        // this function will provide the starting and ending index for the sub arrays
        // this function will run untill there is remaining only one array element

        if (start < end) {

            System.out.println("partition(arr, " + start + ", " + end + ")");
            int pivotIndex = partition(arr, start, end);
            System.out.println("PivotIndex = " + pivotIndex);

            System.out.println("----------------------------------------------------------");

            System.out.println("quickSort(arr, " + start + ", " + (pivotIndex - 1) + ")");
            quickSort(arr, start, pivotIndex - 1);

            System.out.println("----------------------------------------------------------");

            System.out.println("quickSort(arr, " + (pivotIndex + 1) + ", " + end + ")");
            quickSort(arr, pivotIndex + 1, end);

            System.out.println("----------------------------------------------------------");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7 };
        // int[] arr = { 7, 3, 9, 24, 10, 8 };

        System.out.println("Original Array : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}