package pdp_lessons.lesson4;

import java.util.Scanner;

public class CheckMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Yanvar. Qish fasli!");
                break;
            case 2:
                System.out.println("Fevral. Qish fasli!");
                break;
            case 3:
                System.out.println("Mart. Bahor fasli!");
                break;
            case 4:
                System.out.println("Aprel. Bahor fasli!");
                break;
            case 5:
                System.out.println("May. Bahor fasli!");
                break;
            case 6:
                System.out.println("Iyun. Yoz fasli!");
                break;
            case 7:
                System.out.println("Iyul. Yoz fasli!");
                break;
            case 8:
                System.out.println("Avgust. Yoz fasli!");
                break;
            case 9:
                System.out.println("Sentabr. Kuz fasli!");
                break;
            case 10:
                System.out.println("Oktabr. Kuz fasli!");
                break;
            case 11:
                System.out.println("Noyabr. Kuz fasli!");
                break;
            case 12:
                System.out.println("Dekabr. Qish fasli!");
                break;
            default:
                System.out.println("Iltimos sonni 1 - 12 oralig'ida kiriting!");

        }
    }
}
