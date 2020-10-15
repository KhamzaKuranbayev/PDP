package pdp_lessons.module2.extraTask.task1;

public class Product {

    private String type;
    private String name;
    private int cost;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = getQuantity() + quantity;
    }

    public boolean buy(int count) {
        if (getQuantity() >= count) {
            setQuantity(getQuantity() - count);
            return true;
        }
        return false;
    }

    public void add(int count) {
        setQuantity(count);
    }
}
