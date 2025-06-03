package questions;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        int missingNumber = firstMissingPositive(nums);
        System.out.println(missingNumber);
    }

    public static int firstMissingPositive(int[] nums) {
        int missingNumber = 1;
        sort(nums);
        for (int i = 1; i <= nums.length; i++) {
            if (i != nums[i - 1]) {
                return i;
            }
            missingNumber = i + 1;
        }
        return missingNumber;
    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] < array.length && array[i] > 0 && array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] array,int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
