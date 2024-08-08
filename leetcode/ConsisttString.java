public class ConsisttString {
    public static void main(String[] args) {
        System.out.println("ab".indexOf("badab".charAt(2)));
    }

    static int cons(String allowed, String[] words) {
        int cnt = words.length;
        for (String i : words) {
            for (int j = 0; j < i.length(); j++) {
                if (allowed.indexOf(i.charAt(j)) == -1) {
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}
