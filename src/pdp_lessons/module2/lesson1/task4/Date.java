package pdp_lessons.module2.lesson1.task4;

public class Date {

    String year;
    String month;
    String day;

    public Date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate() {
        System.out.printf("%s.%s.%s", this.day, this.month, this.year);
    }
}
