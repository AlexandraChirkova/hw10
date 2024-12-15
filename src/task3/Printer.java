package task3;

public class Printer implements Printable {
    @Override
    public void print(String content) {
        System.out.println("Printing on paper: " + content);
    }
}
