package pdp_lessons.lesson9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Sonni kiriting: (to'xtatish uchun - exit)");
            String number = scanner.nextLine();
            switch (number) {
                case "0":
                    System.out.print("no'l");
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println(getNameNumber(Long.parseLong(number)));
            }
            System.out.println();
        }
    }

    public static String getNameNumber(long num) {
        String str = "";
        String[] unity = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};
        String[] tens = {"", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to'qson"};

        if ((num / 1000000000000L) > 0) {
            str += getNameNumber(num / 1000000000000L) + " trillion ";
            num = num % 1000000000000L;
        }

        if ((num / 1000000000) > 0) {
            str += getNameNumber(num / 1000000000) + " milliard ";
            num = num % 1000000000;
        }

        if ((num / 1000000) > 0) {
            str += getNameNumber(num / 1000000) + " million ";
            num = num % 1000000;
        }

        if ((num / 1000) > 0) {
            str += getNameNumber(num / 1000) + " ming ";
            num = num % 1000;
        }

        if ((num / 100) > 0) {
            str += getNameNumber(num / 100) + " yuz ";
            num = num % 100L;
        }

        if (num > 0) {
            if (num < 10) {
                str += unity[(int) num];
            } else {
                str += tens[(int) num / 10];
                if (((int) num % 10) > 0) {
                    str += " " + unity[(int) num % 10];
                }
            }
        }
        return str;
    }
}
