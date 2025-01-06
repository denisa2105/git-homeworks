import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert n: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
