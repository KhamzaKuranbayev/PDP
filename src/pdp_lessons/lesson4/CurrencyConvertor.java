package pdp_lessons.lesson4;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pul miqdorini kiriting:");
        double amount = scanner.nextDouble();

        System.out.println("Valyuta turini tanlang: USD - dollar, EUR - yevro, CNY - yuan");
        String from = scanner.next();

        System.out.println("Qaysi turga o'zgartirmoqchisiz? USD - dollar, EUR - yevro, CNY - yuan");
        String to = scanner.next();

        double result = 0;
        switch (to) {
            case "USD":
                if (from.equals("EUR")) {
                    result = amount * 1.18321;
                } else if (from.equals("CNY")) {
                    result = amount * 0.146195;
                } else {
                    result = amount;
                }
                break;
            case "EUR":
                if (from.equals("USD")) {
                    result = amount * 0.845168;
                } else if (from.equals("CNY")) {
                    result = amount * 0.123594;
                } else {
                    result = amount;
                }
                break;
            case "CNY":
                if (from.equals("USD")) {
                    result = amount * 6.83932;
                } else if (from.equals("EUR")) {
                    result = amount * 8.09510;
                } else {
                    result = amount;
                }
                break;
            default:
                System.out.println("Bu valyuta turi bazada mavjud emas!");
        }
        if (result != 0) {
            System.out.println(amount + " " + from + " = " + result + " " + to);
        }
    }
}
