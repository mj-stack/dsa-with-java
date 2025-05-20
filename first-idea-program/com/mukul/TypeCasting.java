package com.mukul;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();

        // Type casting or narrowing - it is unsafe
//        int num = (int) input.nextFloat();
//        System.out.println(num);

        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte) a;
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        // System.out.println(d);

//        int number  = 'A';
//        int number2  = 'a';
//        System.out.println(number);
//        System.out.println(number2);

        // System.out.println("नमस्ते");

//        System.out.println(2.5 * 4);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + ((double) i / c) - (d - s);
        System.out.println(result);
    }
}
