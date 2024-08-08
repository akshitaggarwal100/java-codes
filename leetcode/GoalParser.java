public class GoalParser {
    public static void main(String[] args) {
        String order = "G()()()()(al)";
        System.out.println(parser(order));
    }

    static String parser(String order) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == '(' && order.charAt(i + 1) == ')') {
                ans.append('o');
                i++;
            }

            else if (order.charAt(i) == '(' && order.charAt(i + 1) == 'a') {
                ans.append("al");
                i += 2;
            }

            else if (order.charAt(i) == 'G') {
                ans.append('G');
            }
        }
        return ans.toString();
    }
}