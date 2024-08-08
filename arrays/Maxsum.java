public class Maxsum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(sumcheck(arr, m));
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static int sumcheck(int[] arr, int m) {
        int min = max(arr);
        int max = sum(arr);

        while (min < max) {
            int mid = min + (max - min) / 2;
            int tempSum = 0;
            int pieces = 1;
            for (int i = 0; i < arr.length; i++) {
                tempSum += arr[i];
                if (tempSum > mid) {
                    pieces++;
                    i--;
                    tempSum = 0;
                }
            }
            if (pieces <= m) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        return min;
    }
}
