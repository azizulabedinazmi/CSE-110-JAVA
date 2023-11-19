package Assignments.Assignment01;

import java.util.Scanner;

public class Student {
    private static int studentCount = 0;

    private int studentId;
    private String studentName;
    private double studentGpa;
    private boolean isInternational;
    private char studentGrade;

    private static final String UNIVERSITY_NAME = "My University";
    public static String getUniversityName() {
        return UNIVERSITY_NAME;
    }
    

    public Student() {
        this.studentId = generateStudentId();
        studentCount++;
    }

    public Student(String name, double gpa) {
        this();
        this.studentName = name;
        this.studentGpa = gpa;
    }

    public Student(String name, double gpa, boolean isInternational) {
        this(name, gpa);
        this.isInternational = isInternational;
    }

    public void setStudentGrade(char grade) {
        this.studentGrade = grade;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', GPA=%.2f, international=%b, grade=%c}",
                             studentId, studentName, studentGpa, isInternational, studentGrade);
    }

    public static int getStudentCount() {
        return studentCount;
    }

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

        System.out.println("\nTotal Students: " + getStudentCount());
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

        System.out.println("University Name: " + getUniversityName());
        
        return student;
        
    }

    private static int generateStudentId() {
        return (int) (Math.random() * 1000);
    }
}

