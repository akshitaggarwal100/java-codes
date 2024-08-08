import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 7},
            {9, 11, 16},
            {20, 37, 99}
        };

        System.out.println(Arrays.toString(searchRow(arr, eliminateRow(arr, 4), 4)));
    }

    static int[] searchRow(int[][] matrix, int row, int target) {
        int start = 0;
        int end = matrix[row].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == matrix[row][mid]) {
                return new int[] {row, mid};
            }

            else if (target < matrix[row][mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }

    static int eliminateRow(int[][]matrix, int target) {
        int rStart = 0;
        int rEnd = matrix.length - 1;
        while (rStart != rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][0] == target) {
                return mid;
            }

            else if (matrix[mid][0] > target) {
                rEnd = mid - 1;
            }

            else if (matrix[mid][0] < target) {
                rStart = mid;
            }
        }
        return rStart;
    }
}