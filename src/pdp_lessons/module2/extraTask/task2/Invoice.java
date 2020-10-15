package pdp_lessons.module2.extraTask.task2;

public class Invoice {

    private String invoiceNumber;
    private int cost;
    private boolean status;
    private String paidBy;

    public Invoice(String invoiceNumber, int cost, boolean status) {
        this.invoiceNumber = invoiceNumber;
        this.cost = cost;
        this.status = status;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    public boolean pay(int cost) {
        if (getCost() >= cost) {
            setCost(getCost() - cost);
            return true;
        } else {
            return false;
        }
    }

    public String isPay(boolean status) {
        if (status)
            return "to'langan";
        return "to'lanmagan";
    }


    @Override
    public String toString() {
        return "\nInvoice no'meri = '" + invoiceNumber + "', To'lov holati: "
                + isPay(status) + ". Siz " + getCost() + "$ to'lashingiz kerak.";
    }
}
