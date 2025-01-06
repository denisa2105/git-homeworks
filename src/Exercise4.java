import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        // 4. Write a program to calculate the sum
        // of the first N natural numbers using a while loop.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the natural number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int i = 0;

        if (number < 0) {
            System.out.println("Renter a natural number: ");
        } else {
            while (i <= number) {
                sum += i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
