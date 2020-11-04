package pdp_lessons.module3.lesson3.task1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(timeFormatter));

        timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(timeFormatter));
    }
}
