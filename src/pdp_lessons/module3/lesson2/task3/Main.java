package pdp_lessons.module3.lesson2.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int year = 2028;

        Date date;
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyy");

        int difference = Math.abs(year - Integer.parseInt(simpleDateFormat.format(date)));
        calendar.add(Calendar.YEAR, difference);
        System.out.println();

        int working_days = calendar.getWeeksInWeekYear() * 5;
        int weekends = calendar.getWeeksInWeekYear() * 2;

        System.out.println(year + " - yilda : " + working_days + " ta ish kuni, " + weekends + " ta dam olish kuni bor.");

    }
}
