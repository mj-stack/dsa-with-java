package questions;

public class NumberFlooring {
    public static void main(String[] args) {
        // Find the flooring of the target element i.e, the largest number in the array which is <= the target
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        int target = 0;
        int flooring = flooring(array, target);
        System.out.printf("Flooring is: %s", flooring);
    }

    // with linear search
//    private static int flooring(int[] array, int target) {
//        for (int i = array.length - 1; i > 0; i--) {
//            if (array[i] <= target) {
//                return array[i];
//            }
//        }
//        return -1;
//    }

    // with binary search
    private static int flooring(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        if (target < array[start]) {
            System.out.println("As the element is not available in the array");
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int mid = start + ((end - start) / 2);
            if (array[mid] == target) {
                return array[mid];
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = start + 1;
            }
        }
        return array[end];
    }
}
