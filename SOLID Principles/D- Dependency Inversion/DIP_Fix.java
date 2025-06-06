package DependencyInversionPrinciple;

interface NotificationServiceInterfcae{

    void sendNotification(String message);

}
class EmailNotificationSend implements NotificationServiceInterfcae
{

    @Override
    public void sendNotification(String message) {
        // send notification via Email
    }
}

class WhatAppNotificationSend implements NotificationServiceInterfcae
{
    @Override
    public void sendNotification(String message) {
        // send notification via whatsapp
    }
}
class SmSNotificationService implements NotificationServiceInterfcae
{
    @Override
    public void sendNotification(String message) {
        // send notification via sms
    }
}
public class DIP_Fix {


    public static void main(String[] args) {
        NotificationServiceInterfcae notificationService = new WhatAppNotificationSend();
        notificationService.sendNotification("Sending notification for WhatsApp");

        NotificationServiceInterfcae notificationService2 = new SmSNotificationService();
        notificationService2.sendNotification("Sending notification for SMS");
    }

}
