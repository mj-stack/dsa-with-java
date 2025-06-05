public class ClumsyFactorial {
    public static void main(String[] args) {
        int clumsyFactorial = findClumsyFactorial(10);
        System.out.println(clumsyFactorial);
    }

    public static int findClumsyFactorial(int n) {
        if (n < 4) {
            return n;
        } else if (n == 4) {
            return (((n * findClumsyFactorial(n - 1)) / findClumsyFactorial(n - 2)) + findClumsyFactorial(n - 3));
        }

        return n * findClumsyFactorial(n - 1) / findClumsyFactorial(n - 2) + findClumsyFactorial(n - 3) - findClumsyFactorial(n - 4);
    }

}
