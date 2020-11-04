package pdp_lessons.module3.lesson3.task6;

import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2019, 11, 3);
        LocalDate localDate2 = LocalDate.of(2020, 11, 3);
        System.out.println("Farq: " + getDifferenceDay(localDate1, localDate2));
    }

    public static long getDifferenceDay(LocalDate localDate1, LocalDate localDate2) {
        return Duration.between(localDate1.atStartOfDay(), localDate2.atStartOfDay()).toDays();
    }
}
