public class prime {
    public static void main(String[] args) {
        System.out.println(prm(4));
    }

    static boolean prm(int number) {
        if (number < 2) {
            return false;
        }
        int temp = 2;
        while (temp * temp <= number) {
            if (number % temp == 0) {
                return false;
            }
            temp++;
        }
        return true;
    }

    static boolean prm2(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}