package src;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);
        fruits("Mukul", "Anmol", "Ram", "Shyam", "Mohan");
        multiple(21, 22, "Mukul", "Anmol");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fruits(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
