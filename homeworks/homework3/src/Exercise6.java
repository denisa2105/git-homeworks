import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        // 6. Write a program that reverses the digits
        // of an integer using a do-while loop.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer number: ");
        int number = scanner.nextInt();

        int reverseNumber = 0;

        do {
            if (number > 0) {
                reverseNumber = 10 * reverseNumber + number % 10;
                number /= 10;
            }
        } while (number != 0);

        System.out.println(reverseNumber);

    }
}
