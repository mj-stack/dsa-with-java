public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            System.out.printf("Ran %d times: ", (i - 1));
            if (num % i == 0) {
                return false;
            }
            System.out.println();
        }
        return true;
    }
}
