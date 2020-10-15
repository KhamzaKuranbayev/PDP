package pdp_lessons.module2.lesson2.task1;

public class Time {

    private String hour;
    private String minute;
    private String second;

    public String getFullFormat() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }
}
