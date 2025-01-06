import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Names in reverse order: ");
        for( int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
