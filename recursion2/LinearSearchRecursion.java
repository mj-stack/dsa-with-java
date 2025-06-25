public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(array, 9, 0));
    }

    public static int linearSearch(int[] array, int target, int index) {
        if (index >= array.length) {
            return - 1;
        }

        return array[index] == target ? index : (linearSearch(array, target, index + 1));
    }

}
