public class Exercise13 {
    public static void main(String[] args) {
        // 13. Write a program to check if a given string is a palindrome.

        String myString = "Ana";
        myString = myString.toLowerCase();

        int i = 0;
        int j = myString.length() - 1;
        int k = 1;

        while (i < j) {
            if (myString.charAt(i) != myString.charAt(j)) {
                k = 0;
                break;
            }
            i++;
            j--;
        }

        if (k == 1) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

    }
}
