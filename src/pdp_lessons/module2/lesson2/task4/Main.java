package pdp_lessons.module2.lesson2.task4;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Clean Code");
        String[] authors = {"Robert Cecil Martin", "Jeff Langr", "Joshua Bloch"};
        book.setAuthors(authors);
        book.setISBN("9780132350884");
        book.setCost(200);

        System.out.println(book.toString());
    }
}
