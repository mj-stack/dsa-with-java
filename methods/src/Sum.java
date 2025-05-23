import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        int sum = sum(num1, num2);
        System.out.println("The sum of the operation is: " + sum);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // return the value
//    static int sum() {
//        int sum = 0;
//
//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//
//        System.out.print("Enter number 1: ");
//        num1 = input.nextInt();
//
//        System.out.print("Enter number 2: ");
//        num2 = input.nextInt();
//        sum = num1 + num2;
//
//        return sum;
//    }

//    static void sum() {
//        Scanner input = new Scanner(System.in);
//        int num1, num2, sum;
//
//        System.out.print("Enter number 1: ");
//        num1 = input.nextInt();
//
//        System.out.print("Enter number 2: ");
//        num2 = input.nextInt();
//
//        sum = num1 + num2;
//        System.out.println("The sum is: " + sum);
//    }

    /*
        return_type name(arguments) {
            // body
            return statement;
        }
    */
}
