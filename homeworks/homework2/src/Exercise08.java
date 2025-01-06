import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.println("Enter positive number: ");
            number = scanner.nextInt();

            if (number > 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("The sum of all positive numbers entered is " + sum);
    }
}
