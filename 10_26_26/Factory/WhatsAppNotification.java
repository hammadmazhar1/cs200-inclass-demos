public class WhatsAppNotification extends Notification{
    String id;
    public WhatsAppNotification(String id){
        this.id = id;
    }
    public void sendNotification(String message){
        System.out.println(message + " was sent via Whatsapp" + " from id "+ this.id);
    }
}