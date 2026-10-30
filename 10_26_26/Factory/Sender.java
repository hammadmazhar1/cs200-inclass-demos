import java.util.*;
public class Sender{
    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        String msg = scnr.nextLine();

        SMSNotification sms = new SMSNotification();
        EmailNotification email = new EmailNotification();
        WhatsAppNotification whatsapp = new WhatsAppNotification("200");

        sms.sendNotification(msg);
        email.sendNotification(msg);
        whatsapp.sendNotification(msg);
    }
}