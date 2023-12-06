package Azmi06;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rectangle Length : ");
        int length = input.nextInt();
        System.out.print("Enter The Rectangle Breadth : ");
        int breadth = input.nextInt();
        Rectangle r = new Rectangle(length, breadth);
        System.out.print("Enter The Square Length : ");
        int slength = input.nextInt();
        Square s = new Square(slength);
        System.out.println();
        r.printarea();
        r.printperimeter();
        s.printarea();
        s.printperimeter();
        input.close();
    }
}

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printarea() {
        System.out.println(length * breadth);
    }

    void printperimeter() {
        System.out.println(2 * (length + breadth));
    }
}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);
    }
}