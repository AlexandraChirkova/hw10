import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("List of Colors:");
        for (String color : colors) {
            System.out.println(color);
        }

    }
}