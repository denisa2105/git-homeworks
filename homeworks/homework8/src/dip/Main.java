package dip;

public class Main {

    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();

        NotificationService notificationService = new NotificationService(emailNotifier);

        notificationService.sendNotification("Hello, this is a test email!");
    }
}
