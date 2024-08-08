public class NthMagic {
    public static void main(String[] args) {
        System.out.println(magic(6));
    }

    static int magic(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            ans += base * last;
            n >>= 1;
            base *= 5;
        }
        return ans;
    }
}
