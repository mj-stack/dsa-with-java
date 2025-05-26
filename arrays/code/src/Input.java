import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array of  primitives
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        // [1, 2, 3, 4, 5]

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println(Arrays.toString(arr));


        // array of objects
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        System.out.println(Arrays.toString(names));
    }
}
