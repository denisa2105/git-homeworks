package ocp.discount;

public class StudentDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
