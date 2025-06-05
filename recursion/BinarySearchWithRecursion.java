public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 66, 78};
        int target = 67;
        int index = search(array, target, 0, array.length - 1);
        System.out.println(index);
    }

    public static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + ((end - start) / 2);

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return search(array, target, start, end);
    }
}
