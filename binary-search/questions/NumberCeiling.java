package questions;

public class NumberCeiling {
    public static void main(String[] args) {
        // Find the ceiling of the target element i.e, the smallest number in the array which is >= the target
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 3;
        int ceiling = findCeiling(array, target);
        System.out.printf("Ceiling is: %s", ceiling);
    }

    // with linear search
    private static int findCeiling(int[] array, int target) {
        for (int element : array) {
            if (element >= target) {
                return element;
            }
        }
        return -1;
    }
}
