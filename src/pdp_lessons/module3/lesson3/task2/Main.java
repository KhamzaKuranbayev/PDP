package pdp_lessons.module3.lesson3.task2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(5, 45, 30, 30);
        LocalTime finishTime = LocalTime.of(7, 20, 45, 55);
        differenceTime(startTime, finishTime);
    }

    public static void differenceTime(LocalTime startTime, LocalTime finishTime) {
        System.out.println("Difference " + startTime + " with " + finishTime);
        System.out.println("Hours: " + ChronoUnit.HOURS.between(startTime, finishTime));
        System.out.println("Minutes: " + ChronoUnit.MINUTES.between(startTime, finishTime));
        System.out.println("Seconds: " + ChronoUnit.SECONDS.between(startTime, finishTime));
        System.out.println("Nano seconds: " + ChronoUnit.NANOS.between(startTime, finishTime));
    }
}
