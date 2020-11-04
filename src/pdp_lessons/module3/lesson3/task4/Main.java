package pdp_lessons.module3.lesson3.task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.previous;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate now = LocalDate.now();
        LocalDate prevSunday = now.with(previous(SUNDAY));
        LocalDate nextSunday = now.with(next(SUNDAY));

        System.out.println("Oldingi Yakshanba: " + prevSunday.format(formatter) + "\nBugun: " + now.format(formatter)
                + "\nKeyingi Yakshanba: " + nextSunday.format(formatter));

    }
}
