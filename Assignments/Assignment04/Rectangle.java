package Assignments.Assignment04;

import java.util.Scanner;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods for Rectangle-specific attributes
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Additional methods for Rectangle
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for Rectangle
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();

        System.out.println("Enter the color of the rectangle:");
        String color = scanner.next();

        System.out.println("Is the rectangle filled? (true/false):");
        boolean filled = scanner.nextBoolean();

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(width, height, color, filled);

        // Output details of the rectangle
        System.out.println("\nRectangle Details:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Date Created: " + rectangle.getDateCreated());
        scanner.close();
    }
}