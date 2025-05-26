import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(150);
        arr.add(250);
        arr.add(350);
        arr.add(450);
        arr.add(550);
        System.out.println(arr);
        System.out.println(arr.contains(250));
        System.out.println(arr.contains(650));

        int item = arr.remove(2);
        System.out.println(item);
        System.out.println(arr);
    }
}
