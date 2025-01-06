import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(2 * i + " ");
        }
    }
}
