package pdp_lessons.module2.lesson7.task6;

public class Student extends Person {

    String major;

    public Student(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
