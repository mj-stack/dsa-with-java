import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56, 64},
                {18, 12}
        };
        int target = 49;
        int[] indexArray = search(array, target);
        // System.out.println(Arrays.toString(indexArray));
        System.out.println(max(array));
    }

    static int[] search(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] array) {
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
