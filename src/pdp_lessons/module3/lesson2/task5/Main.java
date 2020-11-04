package pdp_lessons.module3.lesson2.task5;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);

        int working_days = 0;
        int currentMonth;

        for (currentMonth = 1; currentMonth <= calendar.getWeeksInWeekYear() * 7; currentMonth++) {
            calendar.set(Calendar.DAY_OF_YEAR, currentMonth);

            if (!isHoliday(calendar)) {
                working_days++;
            }
        }

        System.out.println("2019 - yilda " + currentMonth + " kun bor.\nIsh kunlari: " + working_days);
    }

    public static boolean isHoliday(Calendar calendar) {

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                && calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.NEW_YEAR_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.NEW_YEAR_DAY.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.WOMENS_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.WOMENS_DAY.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.NOWRUZ.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.NOWRUZ.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.REMEMBERS_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.REMEMBERS_DAY.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.EID_AL_FITR1.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.EID_AL_FITR1.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.EID_AL_FITR2.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.EID_AL_FITR2.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.EID_AL_ADHA1.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.EID_AL_ADHA1.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.EID_AL_ADHA2.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.EID_AL_ADHA2.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.INDEPENDENCE_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.INDEPENDENCE_DAY.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.TEACHERS_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.TEACHERS_DAY.getMonth()) {
            return true;
        }

        if (calendar.get(Calendar.DAY_OF_WEEK) == Holidays.CONSTITUTION_DAY.getDay()
                && calendar.get(Calendar.MONTH) == Holidays.CONSTITUTION_DAY.getMonth()) {
            return true;
        }

        return false;
    }
}
