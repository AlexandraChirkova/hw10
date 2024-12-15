package task2;

public class Main {
    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {
            printDayInfo(day);
        }

    }

    public static void printDayInfo(Weekday day) {
        if (day.isHoliday()) {
            System.out.println(day + " is a holiday!");
        } else {
            System.out.println(day + " is a weekday.");
        }
    }
}