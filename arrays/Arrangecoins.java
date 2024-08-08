public class Arrangecoins {
    public static void main(String[] args) {
        System.out.println(coins(15));
    }

    static long coins(long num) {
        long start = 0;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * (mid + 1) / 2 == num) {
                return mid;
            }

            else if (mid * (mid + 1) / 2 < num) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return end;
    }
}