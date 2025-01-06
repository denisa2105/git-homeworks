import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Divisible by both");
        } else if (number % 2 == 0) {
            System.out.println("Divisible by only 2");
        } else if (number % 3 == 0){
            System.out.println("Divisible by only 3");
        } else {
            System.out.println("Not divisible by either");
        }
    }
}
