public class Difference {
    public static void main(String[] args) {
        System.out.println(subtract(4421));
    }

    static int subtract(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}