package questions;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDisappearedNumber {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> arrayList = new ArrayList<>();
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                arrayList.add(j + 1);
            }
        }

        return arrayList;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
