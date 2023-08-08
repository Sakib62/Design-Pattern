package uml_order_system;

import java.util.List;

public class Order {
    private Customer customer;
    private List<OrderDetail> orderDetails;
    private Payment payment;

    public Order(Customer customer, List<OrderDetail> orderDetails, Payment payment) {
        this.customer = customer;
        this.orderDetails = orderDetails;
        this.payment = payment;
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (OrderDetail orderDetail : orderDetails) {
            subtotal += orderDetail.getSubtotal();
        }
        return subtotal;
    }

    public double getWeight() {
        double weight = 0;
        for (OrderDetail orderDetail : orderDetails) {
            weight += orderDetail.getWeight();
        }
        return weight;
    }

    public double getTax(double taxRate) {
        double tax = 0;
        for (OrderDetail orderDetail : orderDetails) {
            tax += orderDetail.getTax(taxRate);
        }
        return tax;
    }

    public double getTotal(double taxRate) {
        return getSubtotal() + getTax(taxRate);
    }

    public void processPayment() {
        payment.processPayment(getTotal(0.10)); // Apply 10% tax rate
    }
}
