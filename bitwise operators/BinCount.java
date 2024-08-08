public class BinCount {
    public static void main(String[] args) {
        System.out.println(counter2(8, 2));
    }

    static int counter(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n >>= 1;
        }
        return cnt;
    }

    static int counter2(int number, int base) {
        return (int)(Math.log(number) / Math.log(base)) + 1;
    }
}
