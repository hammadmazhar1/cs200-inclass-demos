import java.util.*;
public class SenderWithFactory{
    public static void main(String[] args){
        ArrayList<NotificationFactory> notif_generators = new ArrayList<NotificationFactory>();

        notif_generators.add(new SMSNotificationFactory());
        notif_generators.add(new EmailNotificationFactory());
        notif_generators.add(new WhatsAppNotificationFactory());

        String message = "This is a notification";

        for (NotificationFactory i: notif_generators){
            Notification n = i.getProduct();
            n.sendNotification(message);
        }
    }
}