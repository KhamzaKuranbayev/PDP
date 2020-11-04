package pdp_lessons.module3.lesson1.task5;

public enum WeekOfDays {

    MONDAY("DUSHANBA", "ПОНЕДЕЛЬНИК"),
    TUESDAY("SESHANBA", "ВТОРНИК"),
    WEDNESDAY("CHORSHANBA", "СРЕДА"),
    THURSDAY("PAYSHANBA", "ЧЕТВЕРГ"),
    FRIDAY("JUMA", "ПЯТНИЦУ"),
    SATURDAY("SHANBA", "СУББОТА"),
    SUNDAY("YAKSHANBA", "ВОСКРЕСЕНЬЕ");

    private String uzb;
    private String ru;

    WeekOfDays(String uzb, String ru) {
        this.uzb = uzb;
        this.ru = ru;
    }

    public String getUzb() {
        return uzb;
    }

    public String getRu() {
        return ru;
    }
}
