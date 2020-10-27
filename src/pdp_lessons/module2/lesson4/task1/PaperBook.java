package pdp_lessons.module2.lesson4.task1;

public class PaperBook extends Book {

    private int weight;
    private int delivery_day;

    public PaperBook(String author, int cost, int discount, String title, int pageCount, int weight, int delivery_day) {
        super(author, cost, discount, title, pageCount);
        this.weight = weight;
        this.delivery_day = delivery_day;
    }
}
