public class BalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println(balancer(s));
    }

    static int balancer(String s) {
        int l = 0;
        int r = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
                if (l == r && l != 0) {
                    cnt++;
                    l = 0;
                    r = 0;
                }
            }

            else if (s.charAt(i) == 'R') {
                r++;
                if (l == r && l != 0) {
                    cnt++;
                    l = 0;
                    r = 0;
                }
            }
        }
        return cnt;
    }
}