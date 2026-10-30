public class SMSNotificationFactory extends NotificationFactory{
    public Notification getProduct(){
        return new SMSNotification();
    }
}