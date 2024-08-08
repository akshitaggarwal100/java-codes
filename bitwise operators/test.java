import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 7, 6};
        shift(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void shift(int[] arr, int k) {
        int[] ans = new int[arr.length];
        for (int i = k; i < arr.length - 1; i++) {
            ans[k - i] = arr[i];
        }

        for (int j = 0; j < k; j++) {
            arr[j] = ans[arr.length - k + j];
        }
    }
}