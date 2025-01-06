import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        // 21. Write methods to calculate the area of a circle, rectangle, and triangle.
        // Call these methods in the main
        // program to compute areas for different inputs.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int r = scanner.nextInt();

        System.out.println("The are of circle is: " + areaOfCircle(r));


        System.out.println("Enter the length of the rectangle: ");
        int L = scanner.nextInt();

        System.out.println("Enter the width of the rectangle: ");
        int l = scanner.nextInt();

        System.out.println("The area of the rectangle is: " + areaOfRectangle(L, l));

        System.out.println("Enter the base of the triangle: ");
        int b = scanner.nextInt();

        System.out.println("Enter the width of the triangle: ");
        int h = scanner.nextInt();

        System.out.println("The area of the triangle is: " + areaOfTriangle(b, h));
    }

    public static float areaOfCircle(int r) {
        return (float) 3.14 * r * r;
    }

    public static float areaOfRectangle(int L, int l) {
        return (float) L * l;
    }

    public static float areaOfTriangle(int b, int h) {
        return (float) (b * h) / 2;
    }
}
