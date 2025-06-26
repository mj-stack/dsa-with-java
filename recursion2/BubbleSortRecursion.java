import src.Swap;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 4};
        System.out.println(Arrays.toString(array));
        bubbleSort(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (array[c] > array[c+1]) {
                swap(array, c, c+1);
            }
            bubbleSort(array, r, c+1);
        } else {
            bubbleSort(array, r-1, 0);
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
