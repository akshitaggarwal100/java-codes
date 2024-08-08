public class sqrt {
    public static void main(String[] args) {
        int num = 19009600;
        System.out.println(root(num));
    }

    static int root(int num) {
        if (num < 2) {
            return num;
        }

        else {
            for (int i = 0; i <= num / 2; i++) {
                if (i * i > num) {
                    return i - 1;
                }
            }
            return -1;
        }
    }
}