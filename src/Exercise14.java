public class Exercise14 {
    public static void main(String[] args) {

        // 14. Write a program that counts the number of
        // vowels in a given string.

        String string = "fjgojrthlesdmflerkgnrlkgAFK";
        int numverOfVowels = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' ||
                    string.charAt(i) == 'i' || string.charAt(i) == 'o' ||
                    string.charAt(i) == 'u' || string.charAt(i) == 'A' ||
                    string.charAt(i) == 'E' || string.charAt(i) == 'I' ||
                    string.charAt(i) == 'O' || string.charAt(i) == 'U') {
                numverOfVowels++;
            }
        }

        System.out.println(numverOfVowels);
    }
}
