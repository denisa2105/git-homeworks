public class Exercise15 {
    public static void main(String[] args) {

        // 15. Create a program that reverses a string
        // without using the built-in reverse function.

        String string = "Denisa Ciuciuc";
        String reverseString = "";

        for (int i = string.length() - 1; i >= 0 ; i--) {
            reverseString += string.charAt(i);
        }

        System.out.println(reverseString);

    }
}

