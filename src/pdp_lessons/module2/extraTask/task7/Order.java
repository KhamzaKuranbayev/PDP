package pdp_lessons.module2.extraTask.task7;

public class Order {

    int orderId;
    User user;
    Ticket ticket;

    public Order(int orderId, User user, Ticket ticket) {
        this.orderId = orderId;
        this.user = user;
        this.ticket = ticket;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
