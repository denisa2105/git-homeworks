package isp;

public class CreditCardPaymentService implements CreditCardPaymentProcessor {

    @Override
    public void processCreditCardPayment() {
        System.out.println("Processing credit card payment");
    }
}
