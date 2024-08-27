import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        int min, temp;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 24, 10, 1 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
