import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number: ");
        int weekDay = scanner.nextInt();

        String weekDayText = switch (weekDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";

        };

        System.out.println(weekDayText);
    }
}
