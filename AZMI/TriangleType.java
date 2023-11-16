import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lengths of the three sides of the triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }

        scanner.close();
    }
}