package selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {23, 21, 75, 100};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - 1 - i;
            int maxIndex = getMaxIndex(array, 0, lastIndex);
            swap(array, maxIndex, lastIndex);
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int getMaxIndex(int[] array, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
}
