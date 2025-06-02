package cyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void cyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctValue = i + 1;
            if (array[i] == correctValue) {
                i++;
            } else {
                swap(array, i, array[i] - 1);
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
