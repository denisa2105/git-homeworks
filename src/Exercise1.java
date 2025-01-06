import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        // 1. Write a program that checks if a given integer
        // is even or odd using an if statement.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int integer = scanner.nextInt();

        if (integer % 2 == 0) {
            System.out.println("The integer is even");
        } else {
            System.out.println("The integer is odd");
        }
    }
}
