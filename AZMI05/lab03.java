package AZMI05;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int studentID;
    private String studentName;
    private double studentCGPA;

    public Student() {
        super();
    }

    public Student(int studentID, String studentName, double studentCGPA) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public String toString() {
        String result = "";
        result += "Student ID: " + this.studentID;
        result += "Student Name: " + this.studentName;
        result += "Student CGPA: " + this.studentCGPA;
        return result;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
}

class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private Student[] studentList = new Student[100];
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {
        super();
        this.numberOfStudents = 0;
    }

    public Course(String courseID, String courseTitle, double credit) {
        super();
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = 0;
    }

    public String toString() {
        String result = "";
        result += "Course ID: " + this.courseID;
        result += "Course Title: " + this.courseTitle;
        result += "Course Credit: " + this.credit;
        result += "Number of Students: " + this.numberOfStudents;
        return result;
    }

    public void addStudent(Student s) {
        this.numberOfStudents += 1;
        this.studentList[this.numberOfStudents] = s;
        System.out.println("Student added!");
    }

    public void dropStudent(int studentID) {
        boolean dropped = false;
        for (int i = 0; i < this.numberOfStudents; i++) {
            if (this.studentList[i].getStudentID() == studentID) {
                Student[] temp = new Student[this.numberOfStudents - 1];
                for (int y = 0; y < this.numberOfStudents; y++) {
                    if (y == i) {
                        continue;
                    } else {
                        temp[y] = this.studentList[y];
                    }
                }
                this.studentList = temp;
                System.out.println("Student with ID " + studentID + " successfully dropped!!");
                dropped = true;
                this.numberOfStudents = this.numberOfStudents - 1;
                break;
            }
        }
        if (dropped == false) {
            System.out.println("This student either does not exist or has already been deleted!");
        }
    }

    public void addFaculty(Faculty faculty) {
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        for (int i = 0; i < this.numberOfStudents; i++) {
            System.out.println(this.studentList[i].toString());
            System.out.println();
        }
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}

class Faculty {
    private int facultyID;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {
        super();
    }

    public Faculty(int facultyID, String facultyName, String facultyPosition) {
        super();
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public String toString() {
        String result = "";
        result += "Faculty ID: " + this.facultyID;
        result += "Faculty Name: " + this.facultyName;
        result += "Faculty Position: " + this.facultyPosition;
        return result;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }
}

public class lab03 {
    public static void main(String[] args) {
        String firstChoice = "", secondChoice = "";
        int studentID, facultyID;
        String studentName, facultyName;
        double studentCGPA;
        String facultyPosition;
        String courseID, courseTitle;
        double courseCredit;
        Scanner in = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Faculty> faculty = new ArrayList<>();
        while (true) {
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Print");
            System.out.println("e. Search");
            System.out.println("Enter your choice: ");
            firstChoice = in.nextLine();
            switch (firstChoice) {
                case "a":
                    System.out.println("a. Add a student");
                    System.out.println("b. Add a course");
                    System.out.println("c. Add a faculty");
                    System.out.println("Enter your choice: ");
                    secondChoice = in.nextLine();
                    switch (secondChoice) {
                        case "a":
                            if (courses.size() == 0) {
                                System.out.println("You must add a course first!!");
                            } else {
                                System.out.println("Enter student ID: ");
                                studentID = Integer.parseInt(in.nextLine());
                                System.out.println("Enter student name: ");
                                studentName = in.nextLine();
                                System.out.println("Enter student CGPA: ");
                                studentCGPA = Double.parseDouble(in.nextLine());
                                Student temp = new Student(studentID, studentName,
                                        studentCGPA);
                                students.add(temp);
                                System.out.println("Enter course ID to add the student to: ");
                                courseID = in.nextLine();
                                System.out.println(courseID);
                                for (int i = 0; i < courses.size(); i++) {
                                    if (courses.get(i).getCourseID().equals(courseID)) {
                                        courses.get(i).addStudent(temp);
                                        System.out.println("Student added to course!");
                                        break;
                                    }
                                }
                            }
                            break;
                        case "b":
                            System.out.println("Enter course ID: ");
                            courseID = in.nextLine();
                            System.out.println("Enter course title: ");
                            courseTitle = in.nextLine();
                            System.out.println("Enter course credits: ");
                            courseCredit = Double.parseDouble(in.nextLine());
                            courses.add(new Course(courseID, courseTitle, courseCredit));
                            break;
                        case "c":
                            if (courses.size() == 0) {
                                System.out.println("You must add a course first!!");
                            } else {
                                System.out.println("Enter faculty ID: ");
                                facultyID = Integer.parseInt(in.nextLine());
                                System.out.println("Enter faculty name: ");
                                facultyName = in.nextLine();
                                System.out.println("Enter faculty position: ");
                                facultyPosition = in.nextLine();
                                Faculty temp = new Faculty(facultyID, facultyName,
                                        facultyPosition);
                                faculty.add(temp);
                                System.out.println("Enter course ID to assign the faculty to: ");
                                courseID = in.nextLine();
                                for (int i = 0; i < courses.size(); i++) {
                                    if (courses.get(i).getCourseID().equals(courseID)) {
                                        courses.get(i).addFaculty(temp);
                                        System.out.println("Faculty assigned to course!");
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
                            System.out.println("Please enter a valid choice!!");
                    }
                    break;
                case "d":
                    System.out.println("a. Print all students");
                    System.out.println("b. Print all courses");
                    System.out.println("c. Print all faculties");
                    System.out.println("d. Print information of a student");
                    System.out.println("e. Print information of a course");
                    System.out.println("f. Print information of a faculty");
                    System.out.println("g. Print student list and faculty information of a course");
                    System.out.println("h. Print courses taken by a student");
                    System.out.println("Enter your choice: ");
                    secondChoice = in.nextLine();
                    switch (secondChoice) {
                        case "a":
                            for (int i = 0; i < students.size(); i++) {
                                System.out.println(students.get(i).toString());
                                System.out.println();
                            }
                            break;
                        case "b":
                            for (int i = 0; i < courses.size(); i++) {
                                System.out.println(courses.get(i).toString());
                                System.out.println();
                            }
                            break;
                        case "c":
                            for (int i = 0; i < faculty.size(); i++) {
                                System.out.println(faculty.get(i).toString());
                                System.out.println();
                            }
                            break;
                        case "d":
                            System.out.println("Enter student ID: ");
                            studentID = Integer.parseInt(in.nextLine());
                            for (int i = 0; i < students.size(); i++) {
                                if (students.get(i).getStudentID() == studentID) {
                                    System.out.println(students.get(i).toString());
                                }
                            }
                            break;
                        case "e":
                            System.out.println("Enter course ID: ");
                            courseID = in.nextLine();
                            for (int i = 0; i < courses.size(); i++) {
                                if (courses.get(i).getCourseID().equals(courseID)) {
                                    System.out.println(courses.get(i).toString());
                                }
                            }
                            break;
                        case "f":
                            System.out.println("Enter faculty ID: ");
                            facultyID = Integer.parseInt(in.nextLine());
                            for (int i = 0; i < faculty.size(); i++) {
                                if (faculty.get(i).getFacultyID() == facultyID) {
                                    System.out.println(faculty.get(i).toString());
                                }
                            }
                            break;
                    }
                    break;
                case "e":
                    System.out.println("a. Search a student");
                    System.out.println("b. Search a course");
                    System.out.println("c. Search a faculty");
                    System.out.println("d. Search whether a student takes a course");
                    System.out.println("e. Search whether a faculty teaches a course");
                    System.out.println("f. Search courses taken by a student");
                    System.out.println("g. Search courses taught by a faculty");
                    System.out.println("Enter your choice: ");
                    secondChoice = in.nextLine();
                    switch (secondChoice) {
                        case "a":
                            System.out.println("Enter student ID: ");
                            studentID = Integer.parseInt(in.nextLine());
                            for (int i = 0; i < students.size(); i++) {
                                if (students.get(i).getStudentID() == studentID) {
                                    students.get(i).toString();
                                }
                            }
                            break;
                        case "b":
                            System.out.println("Enter course ID: ");
                            courseID = in.nextLine();
                            for (int i = 0; i < courses.size(); i++) {
                                if (courses.get(i).getCourseID() == courseID) {
                                    courses.get(i).toString();
                                }
                            }
                            break;
                        case "c":
                            System.out.println("Enter faculty ID: ");
                            facultyID = Integer.parseInt(in.nextLine());
                            for (int i = 0; i < faculty.size(); i++) {
                                if (faculty.get(i).getFacultyID() == facultyID) {
                                    faculty.get(i).toString();
                                }
                            }
                            break;
                    }
                    break;
            }
        }
    }
}