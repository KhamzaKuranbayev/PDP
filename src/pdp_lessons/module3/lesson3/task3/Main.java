package pdp_lessons.module3.lesson3.task3;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1991, 8, 29);
        System.out.println("Yoshi: " + getAge(birthDay));
    }

    public static int getAge(LocalDate birthday) {
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthday, now);
        return period.getYears();
    }
}
