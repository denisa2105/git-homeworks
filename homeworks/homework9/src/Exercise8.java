import java.util.function.Predicate;

/**
 * 8. Use the built-in Predicate<Integer> functional interface to check if a number is even.
 */


public class Exercise8 {

    public static void main(String[] args) {

        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.out.println(isEven.test(10));
    }
}
