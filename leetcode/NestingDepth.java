public class NestingDepth {
    public static void main(String[] args) {
        String s = "1";
        System.out.println(depth(s));
    }

    static int depth(String s) {
        int max = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
                if (depth > max) {
                    max = depth;
                }
            }

            else if (s.charAt(i) == ')') {
                depth--;
            }
        }
        return max;
    }
}
