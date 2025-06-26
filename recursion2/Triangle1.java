public class Triangle1 {
    public static void main(String[] args) {
        printTriangle(4, 0);
    }

    public static void printTriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            printTriangle(r, ++c);
        } else {
            System.out.println();
            printTriangle(--r, 0);
        }
    }
}
