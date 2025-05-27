public class FindMin {
    public static void main(String[] args) {
        int[] array = {18, 12, -7, 3, 14, 28};
        int ans = findMin(array);
        System.out.println(ans);
    }

    static int findMin(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
