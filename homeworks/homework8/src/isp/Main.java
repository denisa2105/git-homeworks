package isp;

public class Main {
    public static void main(String[] args) {

        CreditCardPaymentProcessor creditCardPaymentService = new CreditCardPaymentService();
        creditCardPaymentService.processCreditCardPayment();

        PayPalPaymentProcessor payPalPaymentService = new PayPalPaymentService();
        payPalPaymentService.processPayPalPayment();
    }
}
