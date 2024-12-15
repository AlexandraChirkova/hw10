import java.util.LinkedList;

public class Task10 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("List before replacement: " + colors);

        colors.set(1, "Purple");
        colors.set(3, "Orange");

        System.out.println("List after replacement: " + colors);
    }
}
