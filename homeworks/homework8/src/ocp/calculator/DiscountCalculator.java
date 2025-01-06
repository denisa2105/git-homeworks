package ocp.calculator;

import ocp.discount.DiscountStrategy;

public class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePriceAfterDiscount(double price) {
        double discount = discountStrategy.calculateDiscount(price);
        return price - discount;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
