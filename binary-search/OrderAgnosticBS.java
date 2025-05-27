public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] array = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int index = orderAgnosticBS(array, target);
        System.out.println(index);
    }

    public static int orderAgnosticBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isAsc = array[end] > array[start];

        while (end >= start) {
            int mid = start + ((end - start) / 2);

            if (array[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (array[mid] > target) {
                    end = mid - 1;
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
