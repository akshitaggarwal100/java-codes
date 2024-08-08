import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 7, 5, -1, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            int max = max(arr, arr.length - 1 - i);
            temp = arr[max];
            arr[max] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    static int max(int[] arr, int end) {
        int max = 0;
        for (int j = 1; j <= end; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
}