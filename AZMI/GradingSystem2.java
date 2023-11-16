import java.util.Scanner;

public class GradingSystem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        char grade;

        if (marks < 25) {
            grade = 'F';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }
}
