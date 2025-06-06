package DependencyInversionPrinciple;

class EmailService{
    public void sendMessage(String message)
    {
        System.out.println("Sending Email" + message);
    }
}


/*
Here we can see that NotificationService is completely dependent on EmailService
Now if we have requirement to send notification via WhatsAPP then we have to change NotificationService class which may cause to error
 */
class NotificationService
{
    EmailService emailService = new EmailService();
    public void sendNotification(String message)
    {
        emailService.sendMessage(message);
    }
}

public class DIP_Example {
    public static void main(String[] args) {

    }
}
