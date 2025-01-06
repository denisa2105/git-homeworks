import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        // 19. Write a method that checks if a number is prime or not.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        isPrime(number);
    }

    public static void isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println("The number is not prime");
                break;
            }
        }

        System.out.println("The number is prime");
    }
}
