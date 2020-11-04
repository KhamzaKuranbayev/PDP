package pdp_lessons.module3.lesson1.task5;

public class WeekOfDaysDemo {
    public static void main(String[] args) {
        WeekOfDays weekOfDays = WeekOfDays.SUNDAY;
        String language = "eng";

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
