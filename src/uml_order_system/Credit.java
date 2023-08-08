package uml_order_system;

public class Credit extends Payment {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public Credit(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for ৳" + amount + ", card number : " + cardNumber);
    }
}
