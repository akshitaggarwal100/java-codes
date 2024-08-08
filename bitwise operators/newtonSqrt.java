public class newtonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int num) {
        double root;
        double x = num;
        while (true) {
            root = 0.5 * (x + num / x);
            if (Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return root;
    }
}
