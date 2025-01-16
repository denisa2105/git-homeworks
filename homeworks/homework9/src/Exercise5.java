/**
 * 5. Define a functional interface Calculator with a method int calculate(int a, int b). Use lambdas to implement
 * this interface for:
 *
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Test these implementations with various inputs.
 */

public class Exercise5 {

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        System.out.println(addition.calculate(5, 3));

        Calculator substraction = (a, b) -> a - b;
        System.out.println(substraction.calculate(0, 9));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println(multiplication.calculate(7, 8));

        Calculator division = (a, b) -> a / b;
        System.out.println(division.calculate(4, 2));
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}