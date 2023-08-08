package uml_order_system;

public class OrderDetail {
    private Item item;
    private int quantity;

    public OrderDetail(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return item.getPrice() * quantity;
    }

    public double getWeight() {
        return item.getWeight() * quantity;
    }

    public double getTax(double taxRate) {
        return getSubtotal() * taxRate;
    }
}