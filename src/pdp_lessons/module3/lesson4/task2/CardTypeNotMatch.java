package pdp_lessons.module3.lesson4.task2;

public class CardTypeNotMatch extends Exception {

    public CardTypeNotMatch(Card card) {
        super("Kartalar tiofasi mos emas! Sizning karta "
                + card.getCardType() + " - " + card.getCardType().getUnit() + " karta");
    }
}
