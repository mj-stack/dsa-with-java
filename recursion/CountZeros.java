public class CountZeros {
    public static void main(String[] args) {
        count(1000);
        System.out.println(count);
    }

    static int count = 0;
    public static void count(int n) {
        if (n == 0) {
            return;
        }
        if (n % 10 == 0) {
            count++;
            count(n / 10);
        } else {
            count(n / 10);
        }
    }

}
