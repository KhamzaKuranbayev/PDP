package pdp_lessons.module2.lesson1.task5;

public class Student {

    String firstname;
    String lastname;
    int groupNumber;
    String[] subjects;

    public Student(String firstname, String lastname, int groupNumber, String[] subjects) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.groupNumber = groupNumber;
        this.subjects = subjects;
    }

    public void printSubjects() {
        System.out.printf("Student: %s %s\nGroup № %s\nSubjects: ", this.lastname, this.firstname, this.groupNumber);

        for (String item : subjects)
            System.out.print(item + ", ");
    }

}
