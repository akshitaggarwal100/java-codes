import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
}
