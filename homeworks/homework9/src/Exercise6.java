import java.util.function.Function;

/**
 * 6. Use a lambda expression with Function<String, Integer> to find the length of a string.
 */
public class Exercise6 {

    public static void main(String[] args) {

        String s = "Hello, world!";

        Function<String, Integer> lengthOfString = str -> str.length();

        System.out.println(lengthOfString.apply(s));
    }
}
