public class MergeSort implements SortingAlgo {
    private void mergeSort(int[] numbers) {
        int n = numbers.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = numbers[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(numbers, left, right);
    }

    public void merge(int[] result, int[] first, int[] second) {
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }
        while (i < first.length) {
            result[k++] = first[i++];
        }
        while (j < second.length) {
            result[k++] = second[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 6, 14, 77, 1, 13};
        SortingAlgo sortingAlgo = new MergeSort();
        sortingAlgo.sort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    @Override
    public void sort(int[] numbers) {
        mergeSort(numbers);
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.println();
    }
}
