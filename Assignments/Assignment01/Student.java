package Assignments.Assignment01;

import java.util.Scanner;

public class Student {
    // Attributes
    private int studentId;
    private String studentName;
    private double studentGpa;
    private boolean isInternational;
    private char studentGrade;

    // Final Static
    private static final String UNIVERSITY_NAME = "East West Univeersity";
    

    // Access Modifier Variation
    public static int studentCount = 0; // Public
    private static int internationalStudentCount = 0; // Private
    int defaultStudentCount = 0; // Default

    // Constructor Overloading
    public Student() {
        this.studentId = generateStudentId();
        studentCount++;
    }

    public Student(String name, double gpa) {
        this(); // Chaining to default constructor
        this.studentName = name;
        this.studentGpa = gpa;
    }

    public Student(String name, double gpa, boolean isInternational) {
        this(name, gpa); // Chaining to the previous constructor
        this.isInternational = isInternational;
        if (isInternational) {
            internationalStudentCount++;
        }
    }

    // Accessor and Mutator methods
    public void setStudentGrade(char grade) {
        this.studentGrade = grade;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    // Static Counter Function
    public static int getStudentCount() {
        return studentCount;
    }

    public static int getInternationalStudentCount() {
        return internationalStudentCount;
    }

    // To String method
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentGpa=" + studentGpa +
                ", isInternational=" + isInternational +
                ", studentGrade=" + studentGrade +
                '}';
    }

    // Object Array as Attribute
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = createStudent(scanner);
        }

        System.out.println("\nAll Students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("University Name: " + UNIVERSITY_NAME);
        System.out.println("\nTotal Students: " + getStudentCount());
        System.out.println("Total International Students: " + getInternationalStudentCount());
       
        

        scanner.close();
    }

    private static Student createStudent(Scanner scanner) {
        System.out.print("\nEnter student name: ");
        String name = scanner.next();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Is the student international? (true/false): ");
        boolean isInternational = scanner.nextBoolean();

        Student student = new Student(name, gpa, isInternational);

        System.out.print("Enter student grade: ");
        char grade = scanner.next().charAt(0);
        student.setStudentGrade(grade);

        return student;
    }

    private static int generateStudentId() {
        // Assume some logic to generate a unique student ID
        return (int) (Math.random() * 1000);
    }
}
