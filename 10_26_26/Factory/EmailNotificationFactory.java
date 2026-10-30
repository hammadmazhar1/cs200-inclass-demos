public class EmailNotificationFactory extends NotificationFactory{
    public Notification getProduct(){
        return new EmailNotification();
    }
}