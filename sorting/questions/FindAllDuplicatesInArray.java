package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1};
        List<Integer> duplicates = findDuplicates(array);
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();

        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                arrayList.add(nums[i]);
            }
        }

        return arrayList;
    }

    public static void cyclicSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
