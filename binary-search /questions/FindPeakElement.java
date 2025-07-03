package questions;

public class FindPeakElement {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-peak-element/description/

        int[] nums = {0, 10, 15, 2};
        int index = findPeakElement(nums);
        System.out.println(index);
    }

    public static int findPeakElement(int[] nums) {
        int ans = 0;

        int start = 0;
        int end = nums.length - 1;
        while (end != start) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
                ans = mid; // probable answer
            } else if (nums[mid] < nums[mid + 1]) {
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return ans;
    }
}
