public class sqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f", root(40, 3));
    }

    static double root(int number, int precision) {
        double root = 0.0;
        int start = 0;
        int end = number;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == number) {
                return mid;
            }

            else if (mid * mid > number) {
                end = mid - 1;
            }

            else if (mid * mid < number) {
                start = mid + 1;
            }
        }
        root = end;
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root < number) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}