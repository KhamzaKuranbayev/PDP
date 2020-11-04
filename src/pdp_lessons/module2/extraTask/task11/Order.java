package pdp_lessons.module2.extraTask.task11;

public class Order {

    private int OrderId;
    private User customer;
    private boolean orderStatus; // true - savdo muvaffaqiyatli false - savdo amalga oshmagan
    private int totalPrice;

    public Order(int orderId, User customer, boolean orderStatus) {
        OrderId = orderId;
        this.customer = customer;
        this.orderStatus = orderStatus;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
