package pdp_lessons.module2.extraTask.task11;

import pdp_lessons.module2.extraTask.task7.Order;

public class OrderDetails {

    private Order order;
    private Product product;
    private int quantity;
    private double cost;
    private double subtotal;

    public OrderDetails(Order order, Product product, int quantity, double cost, double subtotal) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.subtotal = subtotal;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
