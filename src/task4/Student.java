package task4;

public class Student {
    private int grade;

    public Student(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{grade=" + grade + "}";
    }
}
