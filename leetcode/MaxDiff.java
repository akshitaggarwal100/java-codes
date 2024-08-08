public class MaxDiff {
    public static void main(String[] args) {
        
    }

    static int diff(int[] arr) {
        // int maxP = 1;
        // int minP = 1;
        for (int k = 1; k <= 2; k++) {
            // if (k <= 2) {
            int m = max(arr, 0, arr.length - k);
            int temp = arr[arr.length - k];
            arr[arr.length - k] = arr[m];
            arr[m] = temp;
            // }
        }

        for (int i = 0; i <= 1; i++) {
            int m = min(arr, i, arr.length - 3);
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }

        return arr[arr.length - 1] * arr[arr.length - 2] - arr[0] * arr[1];
    }

    static int min(int[] arr, int s, int e) {
        int min = s;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    static int max(int[] arr, int s, int e) {
        int max = s;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
