import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative");
        } else if (number == 0) {
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is positive");
        }
    }
}
