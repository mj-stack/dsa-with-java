import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(array);
    }

    static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
            Swap.swap(array, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
