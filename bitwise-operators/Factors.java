public class Factors {
    public static void main(String[] args) {
        printFactors(20);
    }
    public static void printFactors(int n) {
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                System.out.print(n / i + " ");
            }
        }
    }
}
