package questions;

public class InfiniteArrayQuestion {
    public static void main(String[] args) {
        // Assuming an infinite array and finding the target
        int[] array = {10, 20, 30, 40, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 150, 200, 250, 300, 350, 400, 450, 500};
        int target = 90;
        int element = findElement(array, target);
        System.out.println(element);
    }

    private static int findElement(int[] array, int target) {
        int ans = -1;

        // binary search
        int start = 0;
        int end = 1;
        int initialSubArraySize = 2;

        while (end > start) {
            System.out.println("Ran");
            if (target > array[end]) {
                start = end + 1;
                end += (int) Math.pow(2, initialSubArraySize++);
            } else if (target < array[end]) {
                while (end >= start) {
                    int mid = start + ((end - start) / 2);
                    if (array[mid] > target) {
                        end = mid - 1;
                    } else if (array[mid] < target) {
                        start = mid + 1;
                    } else {
                        return array[mid];
                    }
                }
            } else if (target == array[start] || target == array[end]) {
                if (target == array[start]) {
                    return array[start];
                } else {
                    return array[end];
                }
            }
        }
        return ans;
    }
}
