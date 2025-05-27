public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 190;
        int ans = linearSearch(array, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < array.length; index++) {
            // check of element at every index
            if (array[index] == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
