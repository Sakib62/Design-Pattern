package uml_order_system;

public class Cash extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment for ৳" + amount);
    }
}