package uml_order_system;

public class Check extends Payment {
    private String checkNumber;

    public Check(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing check payment for ৳" + amount + ", check number : " + checkNumber);
    }
}
