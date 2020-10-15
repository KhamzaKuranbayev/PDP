package jetbrains_academy;

import java.util.Scanner;

public class ArabicToRoman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arabic_number = scanner.nextInt();

        System.out.println(getRomanNumber(arabic_number));

    }

    private static String getRomanNumber(int arabic_number) {

        String result = "";

        String[] unity = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        if (arabic_number == 0) {
            result += "0";
        }

        if ((arabic_number / 1000) > 0) {
            String holder = "";
            for (int i = 0; i < arabic_number / 1000; i++) {
                holder += "M";
            }
            result += holder;
            arabic_number = arabic_number % 1000;
        }
        if ((arabic_number / 100) > 0) {
            result += hundreds[arabic_number / 100];
            arabic_number = arabic_number % 100;
        }
        if ((arabic_number / 10) > 0) {
            result += tens[arabic_number / 10];
            arabic_number = arabic_number % 10;
            result += unity[arabic_number];
        }

        return result;
    }
}
