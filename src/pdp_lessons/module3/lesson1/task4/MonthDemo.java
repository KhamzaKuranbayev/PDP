package pdp_lessons.module3.lesson1.task4;

public class MonthDemo {
    public static void main(String[] args) {

        Months month = Months.March;

        switch (month) {
            case March:
            case April:
            case May:
                System.out.println(month.getNameUzb() + " " + month.getIndex() + "-oy,  Bahor fasliga tegishli.");
                break;
            case June:
            case July:
            case August:
                System.out.println(month.getNameUzb() + " " + month.getIndex() + "-oy, Yoz fasliga tegishli oy.");
                break;
            case September:
            case October:
            case November:
                System.out.println(month.getNameUzb() + " " + month.getIndex() + "-oy, Kuz fasliga tegishli oy.");
                break;
            case December:
            case January:
            case February:
                System.out.println(month.getNameUzb() + " " + month.getIndex() + "-oy, Qish fasliga tegishli oy.");
                break;
        }

    }
}
