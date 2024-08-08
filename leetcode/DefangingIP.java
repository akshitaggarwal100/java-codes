public class DefangingIP {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        System.out.println(defange(s));
    }

    static String defange(String s) {
        StringBuilder ad = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                ad.append("[.]");
            }

            else {
                ad.append(s.charAt(i));
            }
        }
        return ad.toString();
    }
}