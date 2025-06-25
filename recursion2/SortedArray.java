public class SortedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        System.out.println(isSorted(array, 0));
    }

    public static boolean isSorted(int[] array, int i) {
        if (i == array.length - 1) {
            return true;
        }
        return (array[i] < array[i + 1]) && (isSorted(array, i + 1));
    }
}
