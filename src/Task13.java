import java.util.HashMap;

public class Task13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Banana");
        map1.put(2, "Apple");
        map1.put(3, "Orange");

        System.out.println("Contents of map1: " + map1);

        HashMap<Integer, String> map2 = new HashMap<>();

        map2.putAll(map1);

        System.out.println("Contents of map2: " + map2);
    }
}
