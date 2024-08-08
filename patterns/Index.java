public class Index {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int col;

            if (row <= n) {
                col = row;
            }

            else {
                col = 2 * n - row;
            }

            for (int tcol = 1; tcol <= col; tcol++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern14(int n) {
        int start = 2;
        int end = 2 * n - 2;

        for (int row = 1; row <= n; row++) {
            if (row == 1) {
                for (int col = 1; col <= 2 * n - 1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            else {
                for (int col = 1; col <= end; col++) {
                    if (col == start || col == end) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                start++;
                end--;
            }
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row <= 2 * n - 1; row++) {
            int tCol = row > n ? 2 * n - row: row;
            int tSpaces = n - tCol;

            for (int spaces = 0; spaces < tSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= tCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        for (int row = 1; row <= 2 * n - 1; row ++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int ch =n - Math.min(Math.min(col - 1, row - 1), Math.min(2*n - 1 - col, 2*n - 1 - row));
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}