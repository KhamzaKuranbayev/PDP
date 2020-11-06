package pdp_lessons.module3.lesson1.task5;

public class WeekOfDaysDemo {
    public static void main(String[] args) {
        WeekOfDays weekOfDays = WeekOfDays.FRIDAY;
        String language = "ru";

        switch (language) {
            case "uz":
                System.out.println(weekOfDays.getUzb());
                break;
            case "ru":
                System.out.println(weekOfDays.getRu());
                break;
            case "eng":
                System.out.println(weekOfDays);
                break;
        }
    }
}
