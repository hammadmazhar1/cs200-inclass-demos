public class BaseDecorator implements Notifier{
    private Notifier wrappee;
    public BaseDecorator(Notifier w){
        wrappee = w;
    }
    public void setNotifier(Notifier w){
        wrappee = w;
    }
    public void send(String message){
        wrappee.send(message);
    }
}