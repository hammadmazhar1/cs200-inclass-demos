public class FBookDecorator extends BaseDecorator{
    public FBookDecorator(Notifier w){
        super(w);
    }
    public void send(String message){
        System.out.println(message + "posted on Facebook");
        super.send(message);
    }
}