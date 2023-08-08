package solid_principles.ocp;

public class TenPercentDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}