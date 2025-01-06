import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

        // 20. Write a recursive method to generate the Fibonacci
        // sequence up to a given number of terms.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for Fibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
