package solid_principles.ocp;

import solid_principles.dip.Notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification sent: " + message);
    }
}