import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println(colors);

        if (colors.size() >= 2) {
            colors.set(1, "Purple");
            System.out.println(colors);
        } else {
            System.out.println("The list doesn't have a second element.");
        }
    }
}
