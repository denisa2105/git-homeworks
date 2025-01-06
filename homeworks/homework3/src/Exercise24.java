public class Exercise24 {
    public static void main(String[] args) {

        // 24. Write a method that checks if a given year is a leap year or not. Use this method in the
        // main program to check several year values.

        int[] yearsToCheck = {2000, 2004, 1900, 2023, 2024};

        for (int year : yearsToCheck) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
