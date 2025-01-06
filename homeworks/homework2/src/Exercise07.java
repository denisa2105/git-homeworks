import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number: ");
        int number = scanner.nextInt();

        if ( number > 0) {
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println(factorial);
        } else {
            System.out.println("Enter a positive integer.");
        }
    }
}
