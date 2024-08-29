import java.util.Arrays;

public class QuickSortLastPivot {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return (i + 1);
    }

    static void quickSort(int[] arr, int start, int end) {
        if(start < end){
            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 4, 1, 3, 9, 7 };
        int[] arr = { 7, 3, 9, 24, 10, 8 };

        System.out.println("Original Array : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
