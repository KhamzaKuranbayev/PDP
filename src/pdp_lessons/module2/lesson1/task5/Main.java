package pdp_lessons.module2.lesson1.task5;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"Matematika", "Fizika", "Informatika", "Ingiliz tili", "Ona tili"};

        Student student = new Student("Savriddin", "Yuldashev", 115, subjects);
        student.printSubjects();
    }
}
