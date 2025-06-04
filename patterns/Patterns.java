public class Patterns {
    public static void main(String[] args) {
        pattern31(4);
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = n - row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 0; row <= ((2 * n) - 1); row++) {
            int totalColsInRow = row > n ? ((2 * n) - row) : row;
            for (int col = 1; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int colsInARow = row > n ? (2 * n) - row : row;
            for (int space = 0; space < n - colsInARow; space++) {
                System.out.print("  ");
            }
            for (int col = colsInARow; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= colsInARow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int row = 0; row <= ((2 * n) - 1); row++) {
            int totalColsInRow = row > n ? ((2 * n) - row) : row;

            int noOfSpaces = n - totalColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int spaces = n - row; spaces >= 0; spaces--) {
                System.out.print("  ");
            }

            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    public static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
