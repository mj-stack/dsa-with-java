import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number  to check if its a power of 2: ");
        int n = in.nextInt();
        boolean ans = n != 0 && (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
