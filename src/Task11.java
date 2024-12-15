import java.util.HashSet;

public class Task11 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Grape");
        set2.add("Apple");

        set1.retainAll(set2);

        System.out.println("Common elements: " + set1);
    }
}
