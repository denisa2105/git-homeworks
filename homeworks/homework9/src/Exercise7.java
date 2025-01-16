/**
 * 7. Define a functional interface StringCombiner with a method String combine(String s1, String s2) and use a
 * lambda to concatenate two strings with a space in between.
 */

public class Exercise7 {

    public static void main(String[] args) {

        StringCombiner stringCombiner = (s1, s2) -> s1 + " " + s2;

        System.out.println(stringCombiner.combine("Hello,", "World!"));

    }
}

@FunctionalInterface
interface StringCombiner {
    String combine(String s1, String s2);
}