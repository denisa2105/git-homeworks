import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        //  Create a basic calculator program that accepts two numbers and an operator,
        //  and performs the operation using a switch statement.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fist number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the operator: ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '/' -> System.out.println(number1 / number2);
            case '+' -> System.out.println(number1 + number2);
            case '-' -> System.out.println(number1 - number2);
            case '*' -> System.out.println(number1 * number2);
            default -> System.out.println("Invalid operator");
        }
    }
}
