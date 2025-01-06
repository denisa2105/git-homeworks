import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the letter: ");
        char letter = scanner.next().charAt(0);

        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input.");
        } else {
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("The letter is a vowel.");
                    break;
                default:
                    System.out.println("The letter is a consonant.");
                    break;
            }
        }
    }
}
