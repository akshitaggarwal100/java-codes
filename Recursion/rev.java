public class rev {
    public static void main(String[] args) {
        nRev2(28714);
        System.out.println(sum);
    }

    static int sum = 0;
    static int base = countD(2345);

    static int countD(int num) {
        int cnt = 1;
        while (num != 0) {
            cnt *= 10;
            num /= 10;
        }
        return cnt / 10;
    }

    static void nRev(int num) {
        if (num == 0) {
            return;
        }

        else {
            sum += (num % 10) * base;
            base /= 10;
            nRev(num / 10);
        }
    }

    static void nRev2(int num) {
        if (num == 0) {
            return;
        }

        sum = sum * 10 + num % 10;
        nRev2(num/10);

    }
}
