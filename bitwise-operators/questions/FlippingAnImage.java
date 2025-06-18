package questions;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] image = flipAndInvertImage(matrix);
        for (int[] ints : image) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            image[i] = reverseAnArray(image[i]);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] ^ 1;
            }
        }

        return image;
    }

    public static int[] reverseAnArray(int[] array) {
        int i = 0;
        while (i < (array.length/2)) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            i++;
        }
        return array;
    }

}
