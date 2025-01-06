import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        // 18. Write a method that takes two integers as
        // parameters and returns the maximum of the two.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println(maximumOfTheTwoNumbers(number1, number2));
    }

    public static int maximumOfTheTwoNumbers(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
