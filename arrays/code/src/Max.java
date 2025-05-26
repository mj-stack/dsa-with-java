public class Max {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = max(array);
        System.out.println("Max is: " + max);
    }

    static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
