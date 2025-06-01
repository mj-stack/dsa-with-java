package questions;

import java.util.Arrays;

public class BSIn2DArrays {
    public static void main(String[] args) {
        int[][] array = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 49;
        int[] index = findIn2DArray(array, target);
        System.out.println(Arrays.toString(index));
    }

    public static int[] findIn2DArray(int[][] array, int target) {
        int row = 0;
        int col = array.length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == target) {
                return new int[]{row, col};
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return new int[]{-1, -1};
    }
}
