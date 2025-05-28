package questions;

public class NumberCeiling {
    public static void main(String[] args) {
        // Find the ceiling of the target element i.e, the smallest number in the array which is >= the target
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ceiling = findCeiling(array, target);
        System.out.printf("Ceiling is: %s", ceiling);
    }

    // with linear search
//    private static int findCeiling(int[] array, int target) {
//        for (int element : array) {
//            if (element >= target) {
//                return element;
//            }
//        }
//        return -1;
//    }

    // with binary search
    private static int findCeiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        if (target > array[end]) {
            return -1; // ceiling doesn't exist
        }
        for (int i = 0; i < array.length; i++) {
            int mid = start + ((end - start) / 2);

            if (array[mid] == target) return array[mid];
            else if (array[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return array[start];
    }
}
