import java.util.LinkedList;

public class Task9 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        String elementToSearch = "Green";

        int firstIndex = colors.indexOf(elementToSearch);
        if (firstIndex != -1) {
            System.out.println("First  '" + elementToSearch + "' is at index: " + firstIndex);
        }

        int lastIndex = colors.lastIndexOf(elementToSearch);
        if (lastIndex != -1) {
            System.out.println("Last  '" + elementToSearch + "' is at index: " + lastIndex);
        }
    }

}
