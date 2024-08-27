
import java.util.*;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swap = false; // array is sorted
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                System.out.println("Array is already sorted!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 24, 10, 1 };
        System.out.println("Original Array : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

    }
}