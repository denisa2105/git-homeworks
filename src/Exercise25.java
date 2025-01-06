import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {

        // 25. Write a method that checks if a given number
        // is a palindrome (e.g., 121, 12321 are palindromes).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = 0;
        int aux = number;

        while (aux != 0) {
            palindrome = palindrome * 10 + aux % 10;
            aux /= 10;
        }

        if (palindrome == number) {
            return true;
        } else {
            return false;
        }
    }
}
