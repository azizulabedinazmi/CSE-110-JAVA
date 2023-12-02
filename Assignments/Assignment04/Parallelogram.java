package Assignments.Assignment04;

import java.util.Scanner;

public class Parallelogram extends GeometricObject {
    private double base;
    private double height;
    private double sideLength;

    // Constructor
    public Parallelogram() {
    }
    public Parallelogram(double base, double height, double sideLength, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.height = height;
        this.sideLength = sideLength;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
     // Methods to calculate area and perimeter for parallelogram
    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + sideLength);
    }

    // Display information about the parallelogram
    @Override
    public String toString() {
        return "Parallelogram{" +
                "base=" + base +
                ", height=" + height +
                ", sideLength=" + sideLength +
                ", color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                ", dateCreated=" + getDateCreated() +
                '}';
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for Parallelogram
        System.out.println("Enter the base of the parallelogram:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the parallelogram:");
        double height = scanner.nextDouble();

        System.out.println("Enter the side length of the parallelogram:");
        double sideLength = scanner.nextDouble();

        System.out.println("Enter the color of the parallelogram:");
        String color = scanner.next();

        System.out.println("Is the parallelogram filled? (true/false):");
        boolean filled = scanner.nextBoolean();

        // Create a Parallelogram object
        Parallelogram parallelogram = new Parallelogram(base, height, sideLength, color, filled);

        // Output details of the parallelogram
        System.out.println("\nParallelogram Details:");
        System.out.println("Base: " + parallelogram.getBase());
        System.out.println("Height: " + parallelogram.getHeight());
        System.out.println("Side Length: " + parallelogram.getSideLength());
        System.out.println("Color: " + parallelogram.getColor());
        System.out.println("Filled: " + parallelogram.isFilled());
        System.out.println("Area: " + parallelogram.calculateArea());
        System.out.println("Perimeter: " + parallelogram.calculatePerimeter());
        System.out.println("Date Created: " + parallelogram.getDateCreated());
        scanner.close();
    }

}