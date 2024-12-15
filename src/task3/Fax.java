package task3;

public class Fax implements Printable{
    @Override
    public void print(String content) {
        System.out.println("Sending fax with content: " + content);
    }
}
