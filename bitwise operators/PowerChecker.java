public class PowerChecker {
    public static void main(String[] args) {
        System.out.println(checker2(0));
    }

    static boolean checker(int number) {
        int cnt = 0;
        while (number > 0) {
            int temp = number & 1;
            if (temp == 1) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
            }
            number >>= 1;
        }
        return true;
    }

    static boolean checker2(int number) {
        if (number == 0) {
            return false;
        }
        return (number & (number - 1)) == 0;
    }
}