package AZMI07;

import java.util.*;

public class LabA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0, circl = 0, rectangl = 0, squar = 0;
        double radius, circleArea = 0.00, rectangleArea = 0.00, squareArea = 0.00;

        System.out.print("How Many Shapes You Want To Create :  ");
        int b_r_name = input.nextInt();

        for (int i = 1; i <= b_r_name; i++) {
            System.out.println("\nChoose Shape Type : \nPress (1) For Create Circle. \nPress (2) For Create Rectangle. \nPress (3) For Create Square. \n");

            try {
                System.out.print("Enter Your Option : ");
                choice = input.nextInt();
            } catch (Exception e) {

            }

            switch (choice) {
                case 1:
                    System.out.print("Enter The Radius Of Circle : ");
                    try {
                        circl = circl + 1;
                        radius = input.nextDouble();

                        Circle c = new Circle(radius);
                        circleArea = circleArea + c.calcArea();
                    } catch (Exception e) {

                    }
                    break;

                case 2:
                    try {
                        rectangl = rectangl + 1;
                        double length, breadth;

                        System.out.print("Enter The Length Of Rectangle : ");
                        length = input.nextDouble();

                        System.out.print("Enter The Breadth Of Rectangle : ");
                        breadth = input.nextDouble();

                        Rectangle r = new Rectangle(length, breadth);
                        rectangleArea = rectangleArea + r.calcArea();
                    } catch (Exception e) {

                    }
                    break;

                case 3:
                    System.out.print("Enter The Size Of Square : ");
                    try {
                        squar = squar + 1;
                        double size;
                        size = input.nextDouble();

                        Square s = new Square(size);
                        squareArea = squareArea + s.calcArea();
                    } catch (Exception e) {

                    }
                    break;
            }
        }

        System.out.println("\nShow All Areas ->");
        System.out.print("Total Circles : " + circl);
        System.out.print("\nTotal Area Of All Circles : " + circleArea);

        System.out.println();
        System.out.print("\nTotal Rectangles :" + rectangl);
        System.out.print("\nTotal Area Of All Rectangles : " + rectangleArea);

        System.out.println();
        System.out.print("\nTotal Squares : " + squar);
        System.out.print("\nTotal Area Of All Squares : " + squareArea + "\n");
        input.close();
    }
}

abstract class Shape {

    int color;

    abstract double calcArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calcArea() {
        return length * breadth;
    }
}

class Square extends Shape {

    double size;

    Square(double size) {
        this.size = size;
    }

    @Override
    double calcArea() {
        return size * size;
    }
}
