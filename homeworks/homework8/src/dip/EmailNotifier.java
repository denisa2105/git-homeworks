package dip;

public class EmailNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("Email sent: " + message);
    }
}
