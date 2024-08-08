import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 6, 8};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
        return arr;
    }
}