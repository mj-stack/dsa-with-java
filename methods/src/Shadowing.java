package src;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // this variable will shadow variable at line no 4
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
