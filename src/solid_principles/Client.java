package solid_principles;

import solid_principles.dip.Notification;
import solid_principles.isp.InStoreOrder;
import solid_principles.isp.OnlineOrder;
import solid_principles.isp.Orderable;
import solid_principles.lsp.ShoppingCart;
import solid_principles.ocp.OrderProcessor;
import solid_principles.ocp.SMSNotification;
import solid_principles.srp.EmailNotification;
import solid_principles.srp.Product;

public class Client {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1000);
        Product phone = new Product("Phone", 500);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(phone);

        // Create orders
        Orderable onlineOrder = new OnlineOrder(cart);
        Orderable inStoreOrder = new InStoreOrder(cart);

        // Create notifications
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        // Create order processors with different notification methods
        OrderProcessor emailOrderProcessor = new OrderProcessor(emailNotification);
        OrderProcessor smsOrderProcessor = new OrderProcessor(smsNotification);

        // Process orders with different notification methods
        emailOrderProcessor.processOrder(onlineOrder);
        smsOrderProcessor.processOrder(inStoreOrder);
    }
}
