import java.util.Scanner;

class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");

        int marks = sc.nextInt();
        
        if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 50) {
            System.out.println("Grade D");
        } else if (marks >= 25) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
        sc.close();

    }
}