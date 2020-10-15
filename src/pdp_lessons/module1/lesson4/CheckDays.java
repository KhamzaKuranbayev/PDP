package pdp_lessons.module1.lesson4;

import java.util.Scanner;

public class CheckDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Dushanba. Ish kuni!");
                break;
            case 2:
                System.out.println("Seshanba. Ish kuni!");
                break;
            case 3:
                System.out.println("Chorshanba. Ish kuni!");
                break;
            case 4:
                System.out.println("Payshanba. Ish kuni!");
                break;
            case 5:
                System.out.println("Juma. Ish kuni!");
                break;
            case 6:
                System.out.println("Shanba. Dam olish kuni!");
                break;
            case 7:
                System.out.println("Yakshanba. Dam olish kuni!");
                break;
            default:
                System.out.println("Iltimos hafta kunini to'g'ri kiriting!");

        }
    }
}
