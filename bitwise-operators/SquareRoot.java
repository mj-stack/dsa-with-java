import java.util.ArrayList;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(81));
    }

    public static int squareRoot(int n) {
        ArrayList<Integer> factorsArray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsArray.add(i);
            }
        }
        return factorsArray.get(factorsArray.size() / 2);
    }
}
