package pdp_lessons.module3.lesson4.task2;

public class Card {

    private int id;
    private String owner;
    private double balance;
    private CardType cardType;

    public Card(int id, String owner, double balance, CardType cardType) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.cardType = cardType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
