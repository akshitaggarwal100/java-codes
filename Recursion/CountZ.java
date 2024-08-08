public class CountZ {
    public static void main(String[] args) {
        System.out.println(cntZ(20400011));
    }

    static int cntZ(int num) {
        return helper(num, 0);
    }

    static int helper(int num, int cnt) {
        if (num == 0) {
            return cnt;
        }

        else if (num % 10 == 0) {
            return helper(num/10, ++cnt);
        }

        return helper(num/10, cnt);
    }
}
