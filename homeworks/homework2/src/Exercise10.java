import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
        int[] arrayOfRandomNumbers = {3, 6, 8, 39, 45, 78, 190, 145, 1000, 9};
        int min = arrayOfRandomNumbers[0];
        int max = arrayOfRandomNumbers[0];

        for (int i = 0; i < 10; i++) {
            if (arrayOfRandomNumbers[i] < min) {
                min = arrayOfRandomNumbers[i];
            } else if (arrayOfRandomNumbers[i] > max) {
                max = arrayOfRandomNumbers[i];
            }
        }

        System.out.println("The smallest element in the array is: " + min);
        System.out.println("The largest element in the array is: " + max);
    }
}
