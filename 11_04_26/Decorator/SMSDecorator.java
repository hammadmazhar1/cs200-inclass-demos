public class SMSDecorator extends BaseDecorator{
    public SMSDecorator(Notifier w){
        super(w);
    }
    public void send(String message){
        super.send(message);
        System.out.println(message + "sent via SMS");
    }
}