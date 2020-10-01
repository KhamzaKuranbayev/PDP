package pdp_lessons.lesson2;

import java.util.Scanner;

public class DollarConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qancha valyuta olmoqchisiz? 1 USD = 1200 UZS");
        double amount = scanner.nextDouble();
        double exchangeRate = 1200;
        System.out.println(amount + " dollar " + (amount * exchangeRate) + " so'm bo'ladi");
    }
}
