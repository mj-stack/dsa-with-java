package questions;

public class FindElementInMountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-in-mountain-array/description/
        int[] mountainArr = {0, 1, 2, 4, 2, 1};
        int target = 3;
        int index = findInMountainArray(target, mountainArr);
        System.out.println(index);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakIndex(mountainArr, 0, mountainArr.length - 1);
        int index;

        index = orderAgnosticBS(mountainArr, target, 0, peak);
        if (index == -1) {
            index = orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);
        }

        return index;
    }

    public static int findPeakIndex(int[] mountainArray, int start, int end) {
        while (end > start) {
            int mid = start + ((end - start) / 2);
            if (mountainArray[mid] > mountainArray[mid + 1]) { // this means you are in descending order
                end = mid;
            } else if (mountainArray[mid] < mountainArray[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBS(int[] array, int target, int start, int end) {
        boolean isAsc = array[start] < array[end];
        while (end >= start) {
            int mid = start + ((end - start) / 2);
            if (array[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (array[mid] > target) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (array[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
