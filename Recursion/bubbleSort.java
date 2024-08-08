public class bubbleSort {
    public static void main(String[] args) {
        
    }

    static int[] sort(int[] arr, int step, int index) {
        if (index < step) {
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }
    }
}
