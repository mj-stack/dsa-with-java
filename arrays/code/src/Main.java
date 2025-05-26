public class Main {
    public static void main(String[] args) {
        // Q. store a roll no
        int a = 19;

        // Q, Store a person's name
        String name = "Mukul Joshi";

        // Q. Store 5 roll nos.
        int rollNo1 = 1;
        int rollNo2 = 2;
        int rollNo3 = 3;
        int rollNo4 = 4;
        int rollNo5 = 5;

        // syntax for array
        // datatype[] variable_name = new datatype[size];
        // or
        // datatype[] variable_name = {your, data, separated, with, commas}
        int[] rollNos = new int[5];
        int[] rollNos2 = {1, 2, 3, 4, 5};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[4]; // actually here object is being created in the memory (heap)

        String[] array = new String[4];
        System.out.println(array[0]);
    }
}