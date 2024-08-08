public class DigitSum {
    public static void main(String[] args) {
        System.out.println(dgProd(1342));
    }

    static int dgProd(int num) {
        if (num == 0) {
            return 1;
        }

        else {
            return num % 10 * dgProd(num / 10);
        }
    }

    static int dgSum(int num) {
        if (num == 0) {
            return 0;
        }

        else {
            return num % 10 + dgSum(num / 10);
        }
    }
}
