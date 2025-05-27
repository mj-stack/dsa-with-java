public class FindNumbersWithEvenNumbersOfDigits {
    public static void main(String[] args) {
        // Given an array nums of integers, return how many of them contain an even numbers of digits.
        // Example 1:
        // Input: nums = [12, 345, 2, 6, 7896]
        // Output: 2
        int[] nums = {12, 345, 2, 6, 7896};
        int count = count(nums);
        System.out.println(count);
    }

    static int count(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        int innerCount = 0;
            for (int j = 0; nums[i] >= 1; j++) {
                nums[i] /= 10;
                innerCount++;
            }
            if (innerCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
