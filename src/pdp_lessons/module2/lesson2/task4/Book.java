package pdp_lessons.module2.lesson2.task4;

import java.util.Arrays;

public class Book {

    private String name;
    private String[] authors;
    private String ISBN;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book { " + "\n" +
                "name= '" + getName() + "'\n" +
                "authors= " + Arrays.toString(getAuthors()) + "\n" +
                "ISBN= " + getISBN() + "\n" +
                "cost= " + getCost() + "$" +
                " }";
    }
}
