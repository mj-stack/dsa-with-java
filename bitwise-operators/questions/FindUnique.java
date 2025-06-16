package questions;

public class FindUnique {
    public static void main(String[] args) {
        int[] array = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUnique(array));
    }

    public static int findUnique(int[] array) {
        int unique = 0;

        for (int i : array) {
            unique ^= i;
        }

        return unique;
    }

}
