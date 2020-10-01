package pdp_lessons;

import java.util.Scanner;

public class MyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ismi: ");
        String firstname = scanner.nextLine();
        System.out.print("Familiyasi: ");
        String lastname = scanner.nextLine();
        System.out.print("Balans: ");
        double balance = scanner.nextDouble();

        double addMoney;
        double withdraw;
        String lastOperation = "";

        while (true) {
            menu();
            int action = scanner.nextInt();
            switch (action) {
                case 1://
                    System.out.printf("\nHurmatli %s %s sizning balansingizda %.1f SO'M pul bor\n",
                            firstname, lastname, balance);
                    lastOperation = "Sizning balansingizda " + balance + " SO'M bor";
                    break;

                case 2:
                    System.out.println("Hisobingizga qancha pul qo'ymoqchisiz?");
                    addMoney = scanner.nextDouble();
                    System.out.print(addMoney + " SO'M qo'yishni tasdiqlaysizmi? Y-ha N-yo'q ");
                    String ask = scanner.next();
                    if (ask.toUpperCase().equals("Y")) {
                        balance += addMoney;
                        System.out.println("Pul muvaffaqiyatli qo'shildi!");
                        lastOperation = "Hisobingizga +" + addMoney + " SO'M pul qo'shildi";
                    } else {
                        System.out.println("Pul qo'shilmadi!");
                        lastOperation = "Pul qo'shish jarayoni bajarilmadi!";
                    }
                    break;

                case 3:
                    if (balance > 0) {
                        System.out.printf("Qancha pul yechmoqchisiz? Sizning balans %.1f SO'M\n", balance);
                        withdraw = scanner.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Pul muvaffaqiyatli yechildi!");
                            lastOperation = "Hisobdan -" + withdraw + " SO'M yechildi";
                        } else {
                            System.out.println("Pul yechishni iloji bo'lmadi!");
                            lastOperation = "Pul yechish jarayoni amalga oshmadi!";
                        }
                    } else {
                        System.out.printf("Kechirasiz siz pul yecha olmaysiz? Sizning balans %.1f SO'M\n", balance);
                        lastOperation = "Pul yechish jarayoni amalga oshmadi!";
                    }
                    break;

                case 4:
                    System.out.println(lastOperation);
                    break;

                case 0:
                    System.out.printf("\nHurmatli %s %s sizning balansingizda %.1f SO'M pul bor\n",
                            firstname, lastname, balance);
                    System.out.println(lastOperation);
                    System.exit(0);

                default:
                    System.out.println("Noto'g'ri operatsiya tanlandi. Iltimos, tekshiring!");
            }

        }

    }

    public static void menu() {
        System.out.println("\n--- MY BANK ---\n");
        System.out.println("1 - Balans");
        System.out.println("2 - Pul qo'yish");
        System.out.println("3 - Pul yechish");
        System.out.println("4 - Oxirgi operatsiya");
        System.out.println("0 - chiqish");
    }

}
