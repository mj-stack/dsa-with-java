package questions;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }

        // binary search
        while (end > start) {
            int mid = start + ((end - start) / 2);
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}
