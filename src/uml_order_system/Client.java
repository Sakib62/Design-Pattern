package uml_order_system;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        // Create a customer
        Customer customer = new Customer("Sakib", "107/A LakeCity", "sakib62.coder@gmail.com", "01811122233");

        // Create some items
        Item item1 = new Item("Item 1", 120.00, 7);
        Item item2 = new Item("Item 2", 150.00, 9);

        // Create some order details
        OrderDetail orderDetail1 = new OrderDetail(item1, 7);
        OrderDetail orderDetail2 = new OrderDetail(item2, 3);

        // Add the order details to the order
        List<OrderDetail> orderDetails = new ArrayList<>();
        orderDetails.add(orderDetail1);
        orderDetails.add(orderDetail2);

        // Create a payment
        Payment payment = new Credit("1234 5678 1012 3456", "12/24", "123");

        // Create the order
        Order order = new Order(customer, orderDetails, payment);

        // Process the payment and print a confirmation message
        order.processPayment();
        System.out.println("Payment processed for order total of ৳" + order.getTotal(0.10)); // Apply 10% tax rate

    }
}