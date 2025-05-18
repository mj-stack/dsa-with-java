public class InsertionSort implements SortingAlgo {
    public static void main(String[] args) {
        int[] array = {8, 6, 14, 77, 1, 13};
        SortingAlgo sortingAlgo = new InsertionSort();
        sortingAlgo.sort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    @Override
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
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
