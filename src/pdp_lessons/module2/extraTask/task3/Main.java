package pdp_lessons.module2.extraTask.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Contact[] contacts = new Contact[10];
        int index = 0;
        int remove_index = 0;
        int id;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - Kontakt qo'shish\n2 - O'zgartirish\n3 - O'chirish\n0 - Chiqish");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (index <= 10) {
                        System.out.print("Telefon nomer: ");
                        String phone_number = scanner.next();
                        System.out.print("Ism: ");
                        String name = scanner.next();
                        System.out.print("Manzil: ");
                        String address = scanner.next();
                        System.out.print("Email: ");
                        String email = scanner.next();

                        contacts[index] = new Contact(index + 1, phone_number, name, address, email);
                        System.out.println("Yangi kontakt qo'shildi!");
                        System.out.println(contacts[index].toString() + "\n");
                        index++;
                    }
                    break;
                case 2:
                    if (index != 0 && remove_index < index) {
                        System.out.println("Kontakt ro'yhati:");
                        for (int i = 0; i < index; i++) {
                            if (!contacts[i].toString().equals("")) {
                                System.out.println(contacts[i].toString());
                            }
                        }
                        System.out.print("\nKerakli kontaktni tanlang: ");
                        id = scanner.nextInt();
                        System.out.println("Qaysi ma'lumotni o'zgartirmoqchisiz?\n1 - Ismi\n2 - Manzili\n3 - Mail");
                        int edit_choice = scanner.nextInt();
                        switch (edit_choice) {
                            case 1:
                                System.out.print("Ism: ");
                                String name = scanner.next();
                                contacts[id - 1].setName(name);
                                System.out.println(contacts[id - 1].toString() + "\n");
                                break;
                            case 2:
                                System.out.print("Manzili: ");
                                String address = scanner.next();
                                contacts[id - 1].setAddress(address);
                                System.out.println(contacts[id - 1].toString() + "\n");
                                break;
                            case 3:
                                System.out.print("Mail: ");
                                String mail = scanner.next();
                                contacts[id - 1].setMail(mail);
                                System.out.println(contacts[id - 1].toString() + "\n");
                                break;
                        }
                    } else {
                        System.out.println("Kontakt bo'sh!\n");
                    }
                    break;
                case 3:
                    if (index != 0 && remove_index < index) {
                        System.out.println("Kontakt ro'yhati:");
                        for (int i = 0; i < index; i++) {
                            System.out.println(contacts[i].toString());
                        }
                        System.out.print("\nIltimos kontaktni tanlang: ");
                        id = scanner.nextInt();

                        contacts[id - 1].removeContact();
                        System.out.println("Kontakt o'chirildi!\n");
                        remove_index++;
                    } else {
                        System.out.println("Kontakt bo'sh!\n");
                    }
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }
}
