package pdp_lessons.module3.lesson4.task2;

import pdp_lessons.module2.lesson10.task3.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransferMoneyDemo {
    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();

        cards.add(new Card(860041, "Khamza Kuranbayev", 1500, CardType.VISA));
        cards.add(new Card(860042, "Jumaniyazov Shokir", 2500, CardType.UNIONPAY));
        cards.add(new Card(860043, "Nurjanov Bekzod", 3000000, CardType.UZCARD));
        cards.add(new Card(860044, "Nurmetov Temur", 650000, CardType.HUMO));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();

            if (choice == 2) break;

            System.out.print("Owner: ");
            scanner = new Scanner(System.in);
            String owner = scanner.nextLine();
            boolean foundOwner = false;
            Card ownerCard = null;
            for (Card card : cards) {
                if (card.getOwner().equals(owner)) {
                    ownerCard = card;
                    foundOwner = true;
                }
            }

            if (foundOwner) {
                System.out.println("\n" + owner + ", qaysi kartaga pul o'tkazmoqchisiz? Balansingiz: " + ownerCard.getBalance());

                boolean b = true;
                while (b) {
                    System.out.print("\nKarta raqamini kiriting: ");
                    int cardId = scanner.nextInt();

                    if (hasCard(cardId, cards)) {
                        Card receiver = getCard(cardId, cards);
                        assert receiver != null;

                        try {
                            checkCardType(ownerCard, receiver);

                            System.out.println("Qabul qiluvchi:  " + receiver.getOwner() + " | Karta: " + receiver.getCardType());

                            boolean b1 = true;
                            while (b1) {
                                System.out.print("\nQancha pul o'tkazmoqchisiz: ");
                                double amount = scanner.nextDouble();
                                try {
                                    checkBalance(amount, ownerCard);
                                    doTransfer(ownerCard, receiver, amount);

                                    System.out.println("\n" + receiver.getOwner() + " ga " + amount + " "
                                            + ownerCard.getCardType().getUnit() + " o'tkazildi!\n");
                                    b = false;
                                    b1 = false;
                                } catch (NotEnoughMoney exception) {
                                    System.out.println(exception.getMessage());
                                }

                            }
                        } catch (CardTypeNotMatch ex) {
                            System.out.println(ex.getMessage());
                        }

                    } else {
                        System.out.println("\nBunday karta topilmadi!");
                    }
                }
            } else {
                System.out.println("\nBunday foydalanuvchi topilmadi!");
            }
        }

    }

    private static void doTransfer(Card ownerCard, Card receiver, double amount) {
        ownerCard.setBalance(ownerCard.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);
    }

    private static boolean hasCard(int cardId, List<Card> cards) {
        for (Card card : cards) {
            if (card.getId() == cardId)
                return true;
        }
        return false;
    }

    public static void checkCardType(Card ownerCard, Card receiver) throws CardTypeNotMatch {
        if (!ownerCard.getCardType().getUnit().equals(receiver.getCardType().getUnit()))
            throw new CardTypeNotMatch(ownerCard);
    }

    private static void checkBalance(double amount, Card ownerCard) throws NotEnoughMoney {
        if (ownerCard.getBalance() < amount)
            throw new NotEnoughMoney();
    }

    public static Card getCard(int cardId, List<Card> cards) {
        for (Card card : cards) {
            if (card.getId() == cardId) {
                return card;
            }
        }
        return null;
    }
}
