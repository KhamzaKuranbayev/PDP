package pdp_lessons.module3.lesson2.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date;
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Joriy Sana: " + simpleDateFormat.format(date));
        int dayOfMonth = Calendar.DAY_OF_MONTH;

        int count = 0;
        while (count < 20) {
            calendar.add(dayOfMonth, 1);

            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek <= 5) {
                count++;
            }
        }
        date = calendar.getTime();

        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("20 ish kunidan keyingi kun: " + simpleDateFormat.format(date));
    }
}
