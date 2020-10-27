package pdp_lessons.module2.lesson4.task1;

public class Book {

    private String author;
    private int cost;
    private double discount;
    private String title;
    private int pageCount;

    public Book(String author, int cost, int discount, String title, int pageCount) {
        this.author = author;
        this.cost = cost;
        this.discount = discount;
        this.title = title;
        this.pageCount = pageCount;
    }

    public void setCost(int cost) {
        this.cost += cost;
    }

    public int getCost() {
        return cost;
    }

    public void setDiscount() {
        this.discount = 0.3 * getCost();
    }

    public double getDiscount() {
        return discount;
    }

    public String getTitle() {
        return title;
    }
}
