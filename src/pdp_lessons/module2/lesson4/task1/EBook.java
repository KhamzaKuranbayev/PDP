package pdp_lessons.module2.lesson4.task1;

public class EBook extends Book {

    private String download_site;
    private int size;

    public EBook(String author, int cost, int discount, String title, int pageCount) {
        super(author, cost, discount, title, pageCount);
    }

    public void printTitle() {
        System.out.println(getTitle());
    }

}
