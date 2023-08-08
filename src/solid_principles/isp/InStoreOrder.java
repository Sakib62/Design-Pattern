package solid_principles.isp;

import solid_principles.lsp.ShoppingCart;
import solid_principles.ocp.TenPercentDiscount;

public class InStoreOrder implements Orderable {
    private ShoppingCart cart;

    public InStoreOrder(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void placeOrder() {
        double total = cart.calculateTotal(new TenPercentDiscount());
        System.out.println("In-store order placed. Total: " + total);
    }
}