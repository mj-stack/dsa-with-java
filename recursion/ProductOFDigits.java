public class ProductOFDigits {
    public static void main(String[] args) {
        System.out.println(product(132));
    }

    public static int product(int n) {
        if (n == 0) {
            return 1;
        }
        return (n % 10) * product(n / 10);
    }
}
