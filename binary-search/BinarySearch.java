public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 18;
        int index = binarySearch(array, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
