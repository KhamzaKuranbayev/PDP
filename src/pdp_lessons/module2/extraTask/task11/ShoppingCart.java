package pdp_lessons.module2.extraTask.task11;

public class ShoppingCart {

    private int shoppingCartId;
    private Product product;
    private int quantity;

    public ShoppingCart(int shoppingCartId, Product product, int quantity) {
        this.shoppingCartId = shoppingCartId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
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
}
