package pdp_lessons.lesson4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + "-yil kabisa yili!");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + "-yil kabisa yili!");
        } else {
            System.out.println(year + "-yil kabisa yili emas!");
        }
    }
}
