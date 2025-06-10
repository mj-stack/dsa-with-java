public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;
        while (x > 0) {
            int lastNum = x % 10;
            reversedNum = (reversedNum * 10) + lastNum;
            x /= 10;
        }

        return originalNum == reversedNum;
    }
}
