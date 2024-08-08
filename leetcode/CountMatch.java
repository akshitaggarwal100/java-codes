public class CountMatch {
    public static void main(String[] args) {
        System.out.println(cnt(9));
    }

    static int cnt(int n) {
        int mSum = 0;
        int match = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                match = n / 2;
                mSum += match;
                n /= 2;
            }

            else {
                match = (n - 1) / 2;
                mSum += match;
                n = ((n - 1) / 2) + 1;
            }
        }
        return mSum;
    }
}
