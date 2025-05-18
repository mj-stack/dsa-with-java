public class BubbleSort implements SortingAlgo {
    public static void main(String[] args) {
        int[] array = {8, 6, 14, 77, 1, 13};
        SortingAlgo sortingAlgo = new BubbleSort();
        sortingAlgo.sort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    @Override
    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
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
