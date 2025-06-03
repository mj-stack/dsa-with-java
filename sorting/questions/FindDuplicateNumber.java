package questions;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int duplicateNum = findDuplicate(array);
        System.out.println(duplicateNum);
    }

    public static int findDuplicate(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void cyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctValue = i + 1;
            if (correctValue < array.length && array[i] != correctValue && array[i] != array[array[i] - 1]) {
                swap(array, i, array[i] - 1);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
