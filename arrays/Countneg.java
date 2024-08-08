public class Countneg {
    public static void main(String[] args) {
        int[][] arr = {
                        {4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}
                        };
        System.out.println(count(arr));
    }

    static int count(int[][] arr) {
        int count = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
