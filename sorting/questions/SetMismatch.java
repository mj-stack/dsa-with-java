package questions;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] array = {3, 2, 2};
        int[] newArray = findErrorNums(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] findErrorNums(int[] nums) {
        sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i+1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
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
