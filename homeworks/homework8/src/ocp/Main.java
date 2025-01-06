package ocp;

import ocp.calculator.DiscountCalculator;
import ocp.discount.RegularDiscount;
import ocp.discount.StudentDiscount;
import ocp.discount.VIPDiscount;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */
public class Main {

    public static void main(String[] args) {

        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        double regularPrice = 100.0;
        System.out.println("Price for regular customer: " + regularCalculator.calculatePriceAfterDiscount(regularPrice));

        DiscountCalculator vipCalculator = new DiscountCalculator(new VIPDiscount());
        double vipPrice = 100.0;
        System.out.println("Price for VIP customer: " + vipCalculator.calculatePriceAfterDiscount(vipPrice));

        DiscountCalculator studentCalculator = new DiscountCalculator(new StudentDiscount());
        double studentPrice = 100.0;
        System.out.println("Price for student: " + studentCalculator.calculatePriceAfterDiscount(studentPrice));

        regularCalculator.setDiscountStrategy(new VIPDiscount());
        System.out.println("New price for regular customer with VIP discount: " + regularCalculator.calculatePriceAfterDiscount(regularPrice));
    }

}