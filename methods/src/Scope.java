package src;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // values initialized outside a block cannot be re-initialized in the block
        int b = 20;
        {
            a = 100;
            int c = 99; // values initialized in a block will remain in the block and cannot be accessed outside
        }

        // Scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        // System.out.println(i); // Cannot access the variable i outside the for loop
    }

    static void random() {
        int num = 10;
        System.out.println(num);
    }
}
