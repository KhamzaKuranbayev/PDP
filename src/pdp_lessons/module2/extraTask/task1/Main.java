package pdp_lessons.module2.extraTask.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Online do'konga xush kelibsiz! ");

        Product phone = new Product();
        initObject(phone, scanner);
        System.out.println();

        Product laptop = new Product();
        initObject(laptop, scanner);
        System.out.println();

        Product washing_machine = new Product();
        initObject(washing_machine, scanner);

        while (true) {
            System.out.println("Iltimos kerakli maxsulotni tanlang: 1 - " + phone.getName()
                    + " 2 - " + laptop.getName() + " 3 - " + washing_machine.getName() + " 4 - exit");
            int item = scanner.nextInt();

            switch (item) {
                case 1:
                    initData(phone, scanner);
                    break;
                case 2:
                    initData(laptop, scanner);
                    break;
                case 3:
                    initData(washing_machine, scanner);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    public static void initObject(Product product, Scanner scanner) {
        System.out.print("Maxsulot turi: ");
        product.setType(scanner.next());

        System.out.print("Maxsulot nomi: ");
        product.setName(scanner.next());

        System.out.print("Maxsulot narxi: ");
        product.setCost(scanner.nextInt());

        System.out.print("Maxsulot soni: ");
        product.setQuantity(scanner.nextInt());
    }

    public static void initData(Product product, Scanner scanner) {
        System.out.println("Iltimos optsiyani tanlang: 1 - sotib olish 2 - omborga qo'shish");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Nechta sotib olmoqchisiz? Omborda " + product.getQuantity() + " ta qolgan.");
                int count = scanner.nextInt();
                if (product.buy(count)) {
                    System.out.println("Haridingiz uchun raxmat, umumiy summa " + product.getCost() * count + " siz " + count + " ta "
                            + product.getName() + " sotib oldingiz.\n");
                } else {
                    System.out.println("Kechirasiz siz so'ragan miqdorda qolmagan, omborda "
                            + product.getQuantity() + " ta qolgan");
                }
                break;
            case 2:
                System.out.println("Omborga nechta qo'shmoqchisiz?");
                int count2 = scanner.nextInt();
                product.add(count2);
                System.out.println("Omborga " + count2 + " ta " + product.getName() + " qo'shildi. Jami: "
                        + product.getQuantity() + "\n");
                break;
        }
    }
}
