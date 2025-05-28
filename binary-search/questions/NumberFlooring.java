package questions;

public class NumberFlooring {
    public static void main(String[] args) {
        // Find the flooring of the target element i.e, the largest number in the array which is <= the target
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int flooring = flooring(array, target);
        System.out.printf("Flooring is: %s", flooring);
    }

    // with linear search
    private static int flooring(int[] array, int target) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] <= target) {
                return array[i];
            }
        }
        return -1;
    }
}
