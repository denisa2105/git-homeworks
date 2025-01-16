import java.util.Scanner;
import java.util.function.Predicate;

/**
 * 3. Use a lambda with Predicate<Integer> to check if a number is greater than 10.
 */


public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x = scanner.nextInt();

        Predicate<Integer> isGreaterThan10 = number -> number > 10;

        System.out.println(isGreaterThan10.test(x));
    }




}
