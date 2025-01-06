import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        // 10. Write a program that calculates
        // the sum of all elements in an array.
        Scanner scanner = new Scanner(System.in);

        int[] array = {20, 40, 60, 70};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
