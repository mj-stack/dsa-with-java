import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        // int[][] arr = new int[3][3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
