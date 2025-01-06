public class Exercise16 {
    public static void main(String[] args) {

        // 16. Write a program to count the
        // number of characters (excluding spaces) in a string.

        String string = "Denisa Ciuciuc ";
        int numberOfCharacters = 0;

        for (int i = 0; i < string.length(); i++) {
            numberOfCharacters++;
        }

        System.out.println(numberOfCharacters);
    }
}
