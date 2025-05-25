package src;

public class Overloading {
    public static void main(String[] args) {
        // fun(21);
        // fun("Mukul");
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
