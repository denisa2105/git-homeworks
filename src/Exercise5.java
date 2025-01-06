import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        // 5. Create a program that calculates the factorial
        // of a number using a while loop.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        if (number < 0) {
            System.out.println("Enter a natural number");
        } else {
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println(factorial);
        }
    }
}
