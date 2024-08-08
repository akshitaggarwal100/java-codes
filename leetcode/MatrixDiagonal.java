public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };
        // int[][] arr = {{5}};
        System.out.println(sum(mat));
    }

    static int sum(int[][] mat) {
        // for primary diagonal
        int col = 0;
        int sum = 0;
        for (int row = 0; row < mat.length; row++) {
            sum += mat[row][col];
            col++;
        }

        // for secondary diagonal
        int ss = 0;
        for (int temp = mat.length - 1; temp >= 0; temp--) {
            if (temp != ss) {
                sum += mat[ss][temp];
            }
            ss++;
        }
        return sum;
    }
}
