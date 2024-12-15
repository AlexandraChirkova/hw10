package task3;

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        Printable fax = new Fax();

        printer.print("Document 1");
        fax.print("Contract");

        Transport car = new Car();
        Transport bicycle = new Bicycle();

        car.move();
        bicycle.move();
    }

}
