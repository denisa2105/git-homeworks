package isp;

public class PayPalPaymentService implements PayPalPaymentProcessor {

    @Override
    public void processPayPalPayment() {
        System.out.println("Processing PayPal payment");
    }
}
