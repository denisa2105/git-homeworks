public class Exercise17 {
    public static void main(String[] args) {

        // 17. Write a program to compare two strings and
        // check if they are equal (case-sensitive and case-insensitive).

        String string1 = "Deni sa";
        String string2 = "denisA";

//        string1 = string1.toLowerCase();
//        string2 = string2.toLowerCase();

        int i = 0;
        int j = 0;
        boolean areEqual = true;

        while (i < string1.length() && j < string2.length()) {
            if (string1.charAt(i) != string2.charAt(j)) {
                areEqual = false;
                break;
            } else {
                i++;
                j++;
            }
        }

        if (areEqual) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    }
}
