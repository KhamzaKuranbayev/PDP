package pdp_lessons.module3.lesson3.task9;

public class Main {
    public static void main(String[] args) {
        getDateTime("2020-07-22T08:40:50.090");
    }

    public static void getDateTime(String datetime) {
        System.out.println(datetime.substring(0, datetime.indexOf('T')));
        System.out.println(datetime.substring(datetime.indexOf('T') + 1));
    }
}
