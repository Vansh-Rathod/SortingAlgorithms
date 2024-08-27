import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        int temp,j;
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && temp <= arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 24, 10, 1 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
