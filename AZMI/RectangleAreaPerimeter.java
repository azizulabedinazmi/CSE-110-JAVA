import java.util.*;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define the width and height of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        sc.close();

        // Calculate the area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Print the results
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
