import java.util.HashMap;

public class Task14 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        String valueToCheck = "Banana";
        if (map.containsValue(valueToCheck)) {
            System.out.println("The HashMap contains the value: " + valueToCheck);
        } else {
            System.out.println("The HashMap does not contain the value: " + valueToCheck);
        }
    }
}
