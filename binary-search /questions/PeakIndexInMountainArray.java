package questions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/
        // Q - You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
        // Return the index of the peak element.
        // Your task is to solve it in O(log(n)) time complexity.
        int[] arr = {0, 10, 15, 2};
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int ans = 0;

        int start = 0;
        int end = arr.length - 1;
        while (end != start) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
                ans = mid; // probable answer
            } else if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return ans;
    }
}
