import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> {
                System.out.println("EMJAY");
                switch (department) {
                    case "HR" -> System.out.println("HR department");
                    case "IT" -> System.out.println("IT department");
                }
            }
            case 2 -> {
                System.out.println("Mukul Joshi");
            }
            case 3 -> {
                System.out.println("Anmol Bisht");
            }
            default -> System.out.println("Default case");
        }
    }
}
