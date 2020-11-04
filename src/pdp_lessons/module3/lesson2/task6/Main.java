package pdp_lessons.module3.lesson2.task6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        // 1. Tue Nov 04 20:14:11 EST 2003
        System.out.println(date);

        // 2. 11/4/03 8:14 PM
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy hh:mm aa");
        System.out.println(format.format(date));

        // 3. 8:14:11 PM
        format = new SimpleDateFormat("hh:mm:ss aa");
        System.out.println(format.format(date));

        // 4. Nov 4, 2003 8:14:11 PM
        format = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss aa");
        System.out.println(format.format(date));

        // 5. 8:14 PM
        format = new SimpleDateFormat("hh:mm aa");
        System.out.println(format.format(date));

        // 6. 8:14:11 PM
        format = new SimpleDateFormat("hh:mm:ss aa");
        System.out.println(format.format(date));

        // 7. 8:14:11 PM EST
        format = new SimpleDateFormat("hh:mm:ss aa z");
        System.out.println(format.format(date));

        // 8. 11/4/03 8:14 PM
        format = new SimpleDateFormat("MM/dd/yy hh:mm aa");
        System.out.println(format.format(date));

        // 9. Nov 4, 2003 8:14 PM
        format = new SimpleDateFormat("MMM dd, yyyy hh:mm aa");
        System.out.println(format.format(date));

        // 10. November 4, 2003 8:14:11 PM EST
        format = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss aa z");
        System.out.println(format.format(date));
    }
}
