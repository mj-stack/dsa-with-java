public class FactorialWithRecursion {
    public static void main(String[] args) {
        int factorial = findFactorial(3);
        System.out.println(factorial);
    }

    public static int findFactorial(int n) {
        return (n < 3) ? n : (n * findFactorial(n - 1));
    }
}
