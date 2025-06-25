public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(array, 18, 0));
    }

    public static int linearSearch(int[] array, int target, int index) {
        if (index == array.length - 1) {
            return array[index] == target ? index : - 1;
        }

        return array[index] == target ? index : (linearSearch(array, target, ++index));
    }

}
