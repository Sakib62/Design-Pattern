package solid_principles.srp;

import solid_principles.dip.Notification;
public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification sent: " + message);
    }
}