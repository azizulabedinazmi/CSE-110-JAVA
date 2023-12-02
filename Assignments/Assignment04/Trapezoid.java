package Assignments.Assignment04;

import java.util.Scanner;

class Trapezoid extends GeometricObject {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(String color, boolean filled, double base1, double base2, double height) {
        super(color, filled);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    public double getPerimeter() {
        // Perimeter of a trapezoid is not uniquely defined
        return base1 + base2 + 2 * Math.sqrt(Math.pow((base2 - base1) / 2, 2) + height * height);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the dimensions for the Trapezoid:");
        System.out.print("Base 1: ");
        double Base1 = scanner.nextDouble();
        System.out.print("Base 2: ");
        double Base2 = scanner.nextDouble();
        System.out.print("Height: ");
        double Height = scanner.nextDouble();

        Trapezoid trapezoid = new Trapezoid("Yellow", false, Base1, Base2, Height);
        System.out.println("Trapezoid Properties:");
        System.out.println("Area: " + trapezoid.getArea());
        System.out.println("Perimeter: " + trapezoid.getPerimeter());
        System.out.println("Color: " + trapezoid.getColor());
        System.out.println("Filled: " + trapezoid.isFilled());
        System.out.println("Date Created: " + trapezoid.getDateCreated());

        scanner.close();
}
}