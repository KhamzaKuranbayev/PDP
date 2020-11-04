package pdp_lessons.module3.lesson2.task1;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        int year = 2024;
        if (calendar.isLeapYear(year)) {
            System.out.println(year + " - yil kabisa yili");
        } else {
            System.out.println(year + " - yil kabisa emas");
        }
    }
}
