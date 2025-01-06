import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] prices = {29.99, 49.50, 10.75, 150.00, 22.40, 73.30};

        double sum = 0;
        int i = 0;

        while (i < prices.length && prices[i] <= 100) {
            sum += prices[i];
            i++;
        }

        System.out.println("The sum of prices up to a price greater than 100 is: " + sum);
    }
}
