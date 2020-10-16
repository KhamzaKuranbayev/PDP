package pdp_lessons.module2.extraTask.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("742-0001", 150, false);
        Invoice invoice2 = new Invoice("742-0002", 250, false);
        Invoice invoice3 = new Invoice("742-0003", 350, false);
        Invoice invoice4 = new Invoice("742-0004", 450, false);
        Invoice invoice5 = new Invoice("742-0005", 550, false);

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("To'lov amalga oshiradigan foydalanuvchi ma'lumotlarini kiriting (0 - Exit): ");
            String fullName = scanner.nextLine();
            if (fullName.equals("0"))
                System.exit(0);

            System.out.print("To'lov qilmoqchi bo'lgan Invoice no'merini kiriting: ");
            String invoiceNumber = scanner.nextLine();

            switch (invoiceNumber) {
                case "742-0001":
                    initData(invoice1, scanner, fullName);
                    break;
                case "742-0002":
                    initData(invoice2, scanner, fullName);
                    break;
                case "742-0003":
                    initData(invoice3, scanner, fullName);
                    break;
                case "742-0005":
                    initData(invoice5, scanner, fullName);
                    break;
                default:
                    System.out.println("Kechirasiz bunday invioce bazadan topilmadi!\n\n");
            }
        }
    }

    public static void initData(Invoice invoice, Scanner scanner, String fullName) {
        System.out.println(invoice.toString());
        System.out.println("Siz qancha to'lov qilmoqchisiz?");
        int pay_amount = scanner.nextInt();
        if (invoice.pay(pay_amount)) {
            invoice.setPaidBy(fullName);
            if (invoice.getCost() == 0) {
                invoice.setStatus(true);
                System.out.println("To'lov summasi to'liq to'landi!\n\n");
            } else {
                System.out.println("To'lov summasi qisman to'landi! Qoldiq summa: " + invoice.getCost() + "\n\n");
            }
        } else {
            System.out.println("Xatolik yuz berdi! Siz ko'p to'ladingiz.\n\n");
        }
    }
}
