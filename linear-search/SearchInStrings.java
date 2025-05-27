public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Mukul Joshi";
        char target = 'y';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    static boolean search2(String name, char target) {
        for (char ch : name.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }

}
