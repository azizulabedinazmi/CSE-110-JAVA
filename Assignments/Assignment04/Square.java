package Assignments.Assignment04;

import java.util.Scanner;

public class Square extends GeometricObject {
    private double width;
    private double height = width;

    public Square() {
        // Default constructor
    }

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Square(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

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

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

   public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for the Square
        System.out.print("Enter the width of the square: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the color of the square: ");
        String color = scanner.next();

        System.out.print("Is the square filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Create a Square object using the entered values
        Square square = new Square(width, width, color, filled);

        // Output the properties of the Square
        System.out.println("\nSquare Properties:");
        System.out.println("Width: " + square.getWidth());
        System.out.println("Height: " + square.getHeight());
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}