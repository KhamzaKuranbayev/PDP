package pdp_lessons.module2.extraTask.task11;

public class Product {

    private String name;
    private Category category;
    private int price;
    private int amount;

    public Product(String name, Category category, int price, int amount) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product Info: " + getName() + "  |  Price: " + getPrice() + "  |  Amount: " + getAmount();
    }
}
