package pdp_lessons.module3.lesson2.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int year = 2020;

        Date date;
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy");

        int difference = Math.abs(year - Integer.parseInt(simpleDateFormat.format(date)));
        calendar.add(Calendar.YEAR, difference);

        calendar.setWeekDate(year, 10, Calendar.FRIDAY);

        date = calendar.getTime();

        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(year + " - yilning 10 - jumasi " + simpleDateFormat.format(date) + " ga to'g'ri keladi.");
    }
}
