public class CheckPalindrome {
    public static void main(String[] args) {
        String string = "mukul";
        boolean isPalindrome = isPalindrome(string);
        System.out.println(isPalindrome ? "Yes" : "No");
    }

    public static boolean isPalindrome(String string) {

        int start = 0;
        int end = string.length();
        while (start < end / 2) {

            if (string.charAt(start) != string.charAt(end - 1)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
