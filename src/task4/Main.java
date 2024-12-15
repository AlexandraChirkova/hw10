package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(90));
        students.add(new Student(75));
        students.add(new Student(85));
        students.add(new Student(60));
        students.add(new Student(95));

        System.out.println("Using foreach:");
        for (Student student : students) {
            System.out.println("Student grade: " + student.getGrade());
        }

        System.out.println("Using iterator:");
        var iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Student grade: " + student.getGrade());
        }
    }

}
