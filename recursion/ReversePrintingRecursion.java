public class ReversePrintingRecursion {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num +  " ");
        printNumbers(num - 1);
    }
}
