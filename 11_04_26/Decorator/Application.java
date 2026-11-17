public class Application{
    public static void main(String[] args){
        Notifier stack = new EmailNotifier();

        stack = new SMSDecorator(stack);

        stack = new FBookDecorator(stack);

        stack.send("There is a quiz in CS 200 this Friday");
    }
}