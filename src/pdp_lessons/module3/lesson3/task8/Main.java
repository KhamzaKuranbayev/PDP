package pdp_lessons.module3.lesson3.task8;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        printInfo();
    }

    public static void printInfo() {
        LocalDate now = LocalDate.now();
        System.out.println("Joriy oyning tartib raqami: " + now.getMonthValue());
        System.out.println("Oyning davomiyligi: " + now.lengthOfMonth());
        System.out.println("Oyning maksimal davomiyligi: " + LocalDate.MAX.lengthOfMonth());
        System.out.println("Kvartalning birinchi oyi: " + now.getMonth().firstMonthOfQuarter());
        System.out.println("Oyning nomi: " + now.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
