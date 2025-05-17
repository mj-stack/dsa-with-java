public class SelectionSort implements SortingAlgo {
    public static void main(String[] args) {
        int[] array = {8, 6, 14, 77, 1, 13};
        SortingAlgo sortingAlgo = new SelectionSort();
        sortingAlgo.sort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            swap(numbers, minIndex, i);
        }
    }

    private void swap(int[] numbers, int minIndex, int i) {
        int thirdNum = numbers[i];
        numbers[i] = numbers[minIndex];
        numbers[minIndex] = thirdNum;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }
}
