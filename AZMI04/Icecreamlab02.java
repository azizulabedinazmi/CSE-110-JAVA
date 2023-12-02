package AZMI04;

import java.util.Scanner;

public class Icecreamlab02 {
    static class Book {
        int isbn;
        String bookTitle;
        int pages;
        int count;

        Book(int ibn, String title, int p, int c) {
            isbn = ibn;
            bookTitle = title;
            pages = p;
            count = c;
        }

        public String displayAll() {
            return "Book ISBN: " + isbn + "\n" +
                    "Book title: " + bookTitle + "\n" +
                    "Book pages: " + pages + "\n" +
                    "Book count:" + count + "\n";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = input.nextInt();
        Book[] a = new Book[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Book ISBN " + (i + 1) + ": ");
            int ibn = input.nextInt();
            System.out.print("Book title " + (i + 1) + ": ");
            input.nextLine();
            String title = input.nextLine();
            System.out.print("Book pages " + (i + 1) + ": ");
            int p = input.nextInt();
            System.out.print("Book count " + (i + 1) + ": ");
            int c = input.nextInt();
            a[i] = new Book(ibn, title, p, c);
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i].displayAll());
        }
        System.out.print("\nEnter the books name to compare: ");
        System.out.print("\nbook name 1: ");
        String title1 = input.next();
        System.out.print("book name 2: ");
        String title2 = input.next();
        System.out.println();
        compareTo(a, title1, title2, n);
        System.out.print("\nEnter the book name to check heavier or not:");
        String title = input.next();
        isHeavier(a, title, n);
        input.close();
    }

    public static void compareTo(Book[] a, String title1, String title2, int n) {
        int page1 = 0, page2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].bookTitle.equalsIgnoreCase(title1))
                page1 = a[i].pages;
            if (a[i].bookTitle.equalsIgnoreCase(title2))
                page2 = a[i].pages;
        }
        if (page1 > page2)
            System.out.println("1");
        else if (page1 < page2)
            System.out.println("-1");
        else
            System.out.println("0");
    }

    public static void isHeavier(Book[] a, String title, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i].bookTitle.equalsIgnoreCase(title))
                if (a[i].pages > 500)
                    System.out.println("True");
                else
                    System.out.println("False");
        }
    }
}