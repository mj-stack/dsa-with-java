import java.util.Arrays;

public class LastWordLength {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        String[] wordsArray = s.split(" ");
        return wordsArray[wordsArray.length - 1].length();
    }
}
