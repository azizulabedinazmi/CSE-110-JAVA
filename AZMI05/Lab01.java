package AZMI05;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Line[] lineArray = new Line[4];
        System.out.println("Enter Your Enements : ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Line No " + (i + 1) + "");
            System.out.print("Enter (X1) Point : ");
            double x1 = input.nextDouble();
            System.out.print("Enter (Y1) Point : ");
            double y1 = input.nextDouble();
            System.out.print("Enter (X2) Point : ");
            double x2 = input.nextDouble();
            System.out.print("Enter (Y2) Point : ");
            double y2 = input.nextDouble();
            System.out.println("");
            lineArray[i] = new Line(x1, y1, x2, y2);
            
        }
        System.out.println("Compare Any Two Lines : ");
        System.out.print("Line No (01) : ");
        int n1 = input.nextInt();
        System.out.print("Line No (02) : ");
        int n2 = input.nextInt();
        System.out.println();
        System.out.println("Is Line 01 And 02 Intersecting ?\nOutput :" +
                isIntersecting(lineArray[n1 - 1], lineArray[n2 - 1]));
                input.close();
    }

    static boolean isIntersecting(Line l1, Line l2) {
        return l1.findSlope() != l2.findSlope();
    }
}

class Line {
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    Line() {
    }

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findSlope() {
        return (this.y2 - this.y1) / (this.x2 - this.x1);
    }

    public String toString() {
        String line = "Line Points (";
        line += x1 + "," + y1 + ")";
        line += "And (" + x2 + "," + y2 + ")";
        return line;
    }
}
