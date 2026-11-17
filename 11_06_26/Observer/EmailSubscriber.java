public class EmailSubscriber implements Subscriber{
    String emailAddress;
    public EmailSubscriber(String email){
        emailAddress = email;
    }
    public void update(String id, String state){
        System.out.println(String.format("Sending email to %s for device %s state update to %s",emailAddress, id, state));
    }
}