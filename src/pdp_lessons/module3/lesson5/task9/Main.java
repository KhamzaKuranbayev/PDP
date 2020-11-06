package pdp_lessons.module3.lesson5.task9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        File file = new File("D:\\" + currentYear);
        file.mkdir();

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        for (int month = 0; month < 12; month++) {
            File file1 = new File(file.getPath() + "\\" + monthNames[month]);
            file1.mkdir();
            calendar = Calendar.getInstance();
            calendar.set(Calendar.MONTH, month);

            int length = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            for (int day = 1; day <= length; day++) {
                calendar.set(currentYear, month, day);
                File file2 = new File(file1.getPath() + "\\" + format.format(calendar.getTime()) + ".txt");
                file2.createNewFile();

                FileWriter fileWriter = new FileWriter(file2);
                fileWriter.write(String.valueOf(LocalDateTime.now()));
                fileWriter.flush();
                fileWriter.close();
            }
        }

    }
}
