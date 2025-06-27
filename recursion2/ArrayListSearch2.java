import java.util.ArrayList;

public class ArrayListSearch2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 5, 5, 8};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> finalList = linearSearch(array, 5, 0, list);
        System.out.println(finalList);
    }

    public static ArrayList<Integer> linearSearch(int[] array, int target, int index, ArrayList<Integer> list) {
        if (index == array.length) {
            return list;
        }
        if (array[index] == target) {
            list.add(index);
        }
        return linearSearch(array, target, ++index, list);
    }
}


