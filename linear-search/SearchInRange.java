public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        int target = 28;
        System.out.println(search(array, target, 1, 4) ? "Found" : "Not Found");
    }

    // Search for 3 in the range of index [1, 4]
    static boolean search(int[] array, int target, int start, int end) {
        if (array.length == 0) {
            return false;
        }
        for (int i = start; i < end; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
