public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(printFibonacci(6));
    }

    public static int printFibonacci(int n) {
        return n < 2 ? n : (printFibonacci(n - 1) + printFibonacci(n - 2));
    }
}
