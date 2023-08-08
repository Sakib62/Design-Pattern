package solid_principles.isp;

import solid_principles.lsp.ShoppingCart;
import solid_principles.ocp.TenPercentDiscount;

public class OnlineOrder implements Orderable {
    private ShoppingCart cart;

    public OnlineOrder(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void placeOrder() {
        double total = cart.calculateTotal(new TenPercentDiscount());
        System.out.println("Online order placed. Total: " + total);
    }
}