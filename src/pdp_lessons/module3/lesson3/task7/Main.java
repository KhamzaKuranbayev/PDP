package pdp_lessons.module3.lesson3.task7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        printInfo(now);
    }

    public static void printInfo(LocalDate now) {
        System.out.println("Joriy yil: " + now.getYear());
        System.out.print("Kabisa yilimi? ");
        int days = 0;
        if (now.isLeapYear()) {
            days = 366;
            System.out.print("Ha");
        } else {
            days = 365;
            System.out.println("Yo'q");
        }
        System.out.println("\nYilning davomiyligi: " + days + " kun");
    }
}
