import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
