public class WhatsAppNotificationFactory extends NotificationFactory{
    public Notification getProduct(){
        return new WhatsAppNotification("400");
    }
}