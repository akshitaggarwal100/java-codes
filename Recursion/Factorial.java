public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

    static int fact(int n) {
        if (n < 3) {
            return n;
        }
        return n * fact(n - 1);
    }
}
