package pdp_lessons.module1.lesson3;

import java.util.Scanner;

public class ShowTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hour = seconds / 3600;
        int remainder = seconds % 3600;
        int minutes = remainder / 60;
        int num = seconds - hour * 3600 - minutes * 60;
        System.out.println(hour + ":" + minutes + ":" + num);
    }
}
