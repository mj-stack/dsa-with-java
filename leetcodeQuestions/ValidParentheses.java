public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
                return true;
            } else if (s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
                return true;
            } else if (s.charAt(i) == '{' && s.charAt(i + 1) == '}') {
                return true;
            }
        }
        return false;
    }
}
