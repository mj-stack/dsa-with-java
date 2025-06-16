package questions;

public class OddEvenFinder {
    public static void main(String[] args) {
        System.out.println(isOdd(2));
    }
    public static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
