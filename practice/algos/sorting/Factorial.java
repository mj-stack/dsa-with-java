public class Factorial {
    public static void main(String ...args) {
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return n;
        }
        return n * fibonacci(n - 1);
    }
}
