import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Insert the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Insert the operator: ");
        char operator = scanner.next().charAt(0);

        int result = switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default ->  -222222222;
        };

        System.out.println(result);
    }
}
