package questions;

public class RotationCountInRBS {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int count = countRotation(arr);
        System.out.println(count);
    }

    public static int countRotation(int[] arr) {
        return (findPivotIndex(arr) + 1);
    }

    public static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return (mid - 1);
            }
            if (arr[mid] > arr[start] && arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            if (arr[mid] < arr[start] && arr[mid] > arr[mid - 1]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
