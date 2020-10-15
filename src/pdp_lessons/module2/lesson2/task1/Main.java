package pdp_lessons.module2.lesson2.task1;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        time.setHour("01");
        time.setMinute("25");
        time.setSecond("08");

        System.out.println(time.getFullFormat());
    }
}
