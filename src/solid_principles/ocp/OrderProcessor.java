package solid_principles.ocp;

import solid_principles.dip.Notification;
import solid_principles.isp.Orderable;

public class OrderProcessor {
    private Notification notification;

    public OrderProcessor(Notification notification) {
        this.notification = notification;
    }

    public void processOrder(Orderable order) {
        order.placeOrder();
        notification.sendNotification("Your order has been processed.");
    }
}