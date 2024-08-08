public class OddValue {
    public static void main(String[] args) {
        
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] temp = new int[m][n];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = 0;
            }
        }

        // incrementing for rows
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                temp[indices[i][0]][j]++;
            }
        }

        // incrementing for column
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++){
                temp[j][indices[i][1]]++;
            }
        }

        int cnt = 0;

        for (int[] row : temp) {
            for (int col : row) {
                if (col % 2 != 0) {
                    cnt++;
                }
            }
        }

        return cnt;

    }
}
