package pdp_lessons.module3.lesson2.task5;

import java.util.Calendar;

public enum Holidays {

    NEW_YEAR_DAY(Calendar.TUESDAY, Calendar.JANUARY),
    WOMENS_DAY(Calendar.FRIDAY, Calendar.MARCH),
    NOWRUZ(Calendar.THURSDAY, Calendar.MARCH),
    REMEMBERS_DAY(Calendar.THURSDAY, Calendar.MAY),
    EID_AL_FITR1(Calendar.TUESDAY, Calendar.JUNE),
    EID_AL_FITR2(Calendar.WEDNESDAY, Calendar.JUNE),
    EID_AL_ADHA1(Calendar.SUNDAY, Calendar.AUGUST),
    EID_AL_ADHA2(Calendar.MONDAY, Calendar.AUGUST),
    INDEPENDENCE_DAY(Calendar.SUNDAY, Calendar.AUGUST),
    TEACHERS_DAY(Calendar.TUESDAY, Calendar.OCTOBER),
    CONSTITUTION_DAY(Calendar.SUNDAY, Calendar.DECEMBER);

    private int day;
    private int month;

    Holidays(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

}
