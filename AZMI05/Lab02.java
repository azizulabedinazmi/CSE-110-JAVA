package AZMI05;

import java.util.*;

public class Lab02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int scount = 0, fcount = 0, ccount = 0;
            System.out.println("***Welcome Our Portal***");
            Student[] std_arr = new Student[9999];
            Course[] course_arr = new Course[9999];
            Faculty[] faculty_arr = new Faculty[9999];
            while (true) {
                System.out.println("a. Add");
                System.out.println("b. Delete");
                System.out.println("c. Update");
                System.out.println("d. Print");
                System.out.println("e. Search");
                char key = input.next().charAt(0);
                switch (key) {
                    case 'a': {
                        print();
                        System.out.println("a. Add a Student ");
                        System.out.println("b. Add a Course ");
                        System.out.println("c. Add a Faculty ");
                        char key2 = input.next().charAt(0);
                        switch (key2) {
                            case 'a': {
                                print();
                                System.out.println("Enter The Student info :");
                                System.out.print("Student ID : ");
                                int id = input.nextInt();
                                System.out.print("Student Name : ");
                                String name = input.nextLine();
                                System.out.print("Student CGPA : ");
                                Double CGPA = input.nextDouble();
                                System.out.println("STUDENT COUNT " +scount);
                                std_arr[scount] = new Student(id, name,CGPA);
                                scount++;
                                System.out.println(scount);
                                break;
                            }
                            case 'b': {
                                print();
                                System.out.println("Enter The Course info : ");
                                System.out.print("Course ID : ");
                                String courseid = input.nextLine();
                                System.out.print("Course Title : ");
                                String coursetitle = input.nextLine();
                                System.out.print("Course Credit : ");
                                Double coursecred = input.nextDouble();
                                course_arr[ccount] = new Course(courseid, coursetitle, coursecred);
                                ccount++;
                                break;
                            }
                            case 'c': {
                                print();
                                System.out.println("Enter The Faculty info :");
                                System.out.print("Faculty ID : ");
                                int fac_id = input.nextInt();
                                System.out.print("Faculty Name : ");
                                String fac_name = input.nextLine();
                                System.out.print("Faculty Position : ");
                                String fac_position = input.nextLine();
                                faculty_arr[fcount] = new Faculty(fac_id, fac_name, fac_position);
                                fcount++;
                                break;
                            }
                        }
                        break;
                    }
                    case 'b': {
                        print();
                        System.out.println("a. Delete a Student Info ");
                        System.out.println("b. Delete a Course Info ");
                        System.out.println("c. Delete a Faculty Info ");
                        char key2 = input.next().charAt(0);
                        switch (key2) {
                            case 'a': {
                                System.out.println(" Enter The Student ID : ");
                                int studentId = input.nextInt();
                                int index = -1;
                                ;
                                for (int i = 0; i < scount; i++) {
                                    if (std_arr[i].getStudentId() == studentId) {
                                        index = i;
                                        break;
                                    }
                                }
                                if (index == -1) {
                                    System.out.println("Info Not Found. Please Try Again !");
                                } else {
                                    std_arr[scount] = null;
                                    scount--;
                                }
                                break;
                            }
                            case 'b': {
                                print();
                                print();
                                print();
                                print();
                                print();
                                System.out.println(" Enter The Course ID: ");
                                String studentId = input.next();
                                int index = -1;
                                for (int i = 0; i < ccount; i++) {
                                    if (course_arr[i].getCourseId().equalsIgnoreCase(studentId)) {
                                        index = i;
                                        break;
                                    }
                                }
                                if (index == -1) {
                                    System.out.println("Course not found");
                                } else {
                                    course_arr[ccount] = null;
                                    ccount--;
                                }
                                break;
                            }
                            case 'c': {
                                print();
                                System.out.println(" Enter The Faculy ID: ");
                                int studentId = input.nextInt();
                                int index = -1;
                                for (int i = 0; i < fcount; i++) {
                                    if (faculty_arr[i].getFacultyId() == studentId) {
                                        index = i;
                                    }
                                }
                                if (index == -1) {
                                    System.out.println("Faculty not found");
                                } else {
                                    faculty_arr[fcount] = null;
                                    fcount--;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 'c': {
                        print();
                        System.out.println("a. Update Student Info ");
                        System.out.println("b. Update Course Info ");
                        System.out.println("c. Update Faculty Info ");
                        char key2 = input.next().charAt(0);
                        switch (key2) {
                            case 'a': {
                                print();
                                System.out.println(" Enter The Student ID : ");
                                int studentId = input.nextInt();
                                for (int i = 0; i < scount; i++) {
                                    if (std_arr[i].getStudentId() == studentId) {
                                        System.out.println("Enter The Info Which You Updated : ");
                                        System.out.print("Student ID : ");
                                        int id = input.nextInt();
                                        System.out.print("Student Name : ");
                                        String name = input.next();
                                        System.out.print("Student CGPA : ");
                                        Double CGPA = input.nextDouble();
                                        std_arr[i].setStudentId(id);
                                        std_arr[i].setStudentName(name);
                                        std_arr[i].setCGPA(CGPA);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 'b': {
                                print();
                                System.out.println(" Enter The Course ID Which You Updated : ");
                                String studentId = input.next();
                                System.out.println(
                                        "Press (1) To ADD Or DROP Students And faculty And Any Other Change Info : ");
                                int a = input.nextInt();
                                if (a == 1) {
                                    int index = -1;
                                    for (int i = 0; i < ccount; i++) {
                                        if (course_arr[i].getCourseId().equalsIgnoreCase(studentId)) {
                                            index = i;
                                            break;
                                        }
                                    }
                                    System.out.println("Enter The 'a' To Add Students ");
                                    System.out.println("Enter The 'b' To Add Faculty ");
                                    System.out.println("Enter The 'c' To Drop A Student ");

                                    System.out.println("Enter The 'd' To Drop Faculty ");
                                    char update = input.next().charAt(0);
                                    switch (update) {
                                        case 'a': {
                                            print();
                                            System.out.println("Enter The Student ID : ");
                                            int studentid = input.nextInt();
                                            for (int i = 0; i < scount; i++) {
                                                if (std_arr[i].getStudentId() == studentid) {
                                                    course_arr[index].addStudent(std_arr[i]);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case 'b': {
                                            print();
                                            System.out.println("Enter The Faculty ID : ");
                                            int studentid = input.nextInt();
                                            for (int i = 0; i < fcount; i++) {
                                                if (faculty_arr[i].getFacultyId() == studentid) {
                                                    course_arr[index].addFaculty(faculty_arr[i]);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case 'c': {
                                            print();
                                            System.out.println("Enter The Student ID : ");
                                            int studentid = input.nextInt();
                                            for (int i = 0; i < scount; i++) {
                                                if (std_arr[i].getStudentId() == studentid) {
                                                    course_arr[index].dropStudent(studentid);
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case 'd': {
                                            print();
                                            System.out.println("Enter The Faculty ID : ");
                                            int studentid = input.nextInt();
                                            for (int i = 0; i < fcount; i++) {
                                                if (faculty_arr[i].getFacultyId() == studentid) {
                                                    course_arr[index].dropFaculty();
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else {
                                    for (int i = 0; i < ccount; i++) {
                                        if

                                        (course_arr[i].getCourseId().equalsIgnoreCase(studentId)) {
                                            System.out.println(" Enter Updated Course iInfo ");
                                            System.out.print("Course ID: ");
                                            String courseid = input.next();
                                            System.out.print("Course Title : ");
                                            String coursetitle = input.next();
                                            System.out.print("Course Credit : ");
                                            Double coursecred = input.nextDouble();
                                            course_arr[i].setCourseId(courseid);
                                            course_arr[i].setCourseTitle(coursetitle);
                                            course_arr[i].setCredit(coursecred);
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 'c': {
                                print();
                                System.out.println("Enter The Faculty ID: ");
                                int studentId = input.nextInt();
                                for (int i = 0; i < fcount; i++) {
                                    if (faculty_arr[i].getFacultyId() == studentId) {
                                        System.out.println("Enter The Updated Info : ");
                                        System.out.print("Faculty ID : ");
                                        int id = input.nextInt();
                                        System.out.print("Faculty Name : ");
                                        String name = input.nextLine();
                                        System.out.print("Faculty Position : ");
                                        String position = input.nextLine();
                                        faculty_arr[i].setFacultyId(id);
                                        faculty_arr[i].setFacultyName(name);
                                        faculty_arr[i].setFacultyPosition(position);
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 'd': {
                        print();
                        System.out.println("a. Print All Students ");
                        System.out.println("b. Print All Courses ");
                        System.out.println("c. Print All Faculties ");
                        System.out.println("d. Print Info Of a Student");
                        System.out.println("e. Print Info Of a Course ");
                        System.out.println("f. Print Info Of a Faculty ");
                        System.out.println("g. Print Student List And Faculty InfO Of a Course ");
                        System.out.println("h. Print Courses Taken By a Student ");
                        char key2 = input.next().charAt(0);
                        switch (key2) {
                            case 'a': {
                                print();
                                System.out.println("All Student Name List : ");
                                for (int i = 0; i < scount; i++) {
                                    System.out.println("Student " + (i +
                                            1) + " : " +
                                            std_arr[i].getStudentName());
                                }
                                break;
                            }
                            case 'b': {
                                print();
                                System.out.println("All Course Name List: ");
                                for (int i = 0; i < ccount; i++) {
                                    System.out.println(+(i + 1) +
                                            "Course Name: " +
                                            course_arr[i].getCourseTitle() + "Course id : " +
                                            course_arr[i].getCourseId());
                                }
                                break;
                            }
                            case 'c': {
                                print();
                                for (int i = 0; i < fcount; i++) {
                                    System.out.println("All Faculty Name List : ");
                                    System.out.println(+(i + 1) +
                                            "Faculty Name: " +
                                            faculty_arr[i].getFacultyName());
                                }
                                break;
                            }
                            case 'd': {
                                print();
                                System.out.print("Enter The Student ID : ");
                                int search = input.nextInt();
                                for (int i = 0; i < scount; i++) {
                                    if (search == std_arr[i].getStudentId()) {
                                        System.out.println(std_arr[i].toString());
                                    }
                                }
                                break;
                            }
                            case 'e': {
                                print();
                                System.out.print("Enter The Course ID : ");
                                String search = input.nextLine();
                                for (int i = 0; i < ccount; i++) {
                                    if (search.equalsIgnoreCase(course_arr[i].getCourseId())) {
                                        System.out.println(course_arr[i]
                                                .toString());
                                    }
                                }
                                break;
                            }
                            case 'f': {
                                print();
                                System.out.print("Enter The Faculty ID : ");
                                int search = input.nextInt();
                                for (int i = 0; i < fcount; i++) {
                                    if (search == faculty_arr[i].getFacultyId()) {
                                        System.out.println(faculty_arr[i].toString());
                                    }
                                }
                                break;
                            }
                            case 'g': {
                                print();
                                System.out.print("Enter The Course ID : ");
                                String search = input.nextLine();
                                for (int i = 0; i < ccount; i++) {
                                    if

                                    ((course_arr[i].getCourseId()).equalsIgnoreCase(search)) {
                                        System.out.println("Factulty Info : " +
                                                course_arr[i].getFaculty());
                                        System.out.println("The Student list : ");
                                        course_arr[i].printStudentList();
                                        break;
                                    }
                                }
                                break;
                            }
                            case 'h': {
                                print();
                                System.out.print("Enter The Student ID : ");
                                int search = input.nextInt(), flag = -1;
                                System.out.println("Courses Ttaken By This Student Are : ");
                                for (int i = 0; i < ccount; i++) {
                                    for (int j = 0; j <

                                            course_arr[i].getNumberOfStudents(); j++) {
                                        if (search == course_arr[i].studentlist[j].getStudentId()) {
                                            if (search == course_arr[i].getStudentId(j)) {
                                                System.out.println(course_arr[i]);
                                                flag++;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (flag == -1) {
                                    System.out.println("Student Has Not Taken Any Courses !");
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case 'e': {
                        print();
                        System.out.println("a. Search a Student ");
                        System.out.println("b. Search a Course ");
                        System.out.println("c. Search a Faculy ");
                        System.out.println("d. Search If a Student Takes a Course ");
                        System.out.println("e. Search If a Faculty Teaches a Course ");
                        System.out.println("f. Search Courses Taken By a Student ");
                        System.out.println("g. Search Courses Taught By a Faculty ");
                        char key2 = input.next().charAt(0);
                        switch (key2) {
                            case 'a': {
                                print();
                                System.out.println("Press '1' to Search By Name And '2' To Search By ID ");
                                int search_option = input.nextInt();
                                if (search_option == 1) {
                                    System.out.print("Enter The Student Name : ");
                                    String name = input.nextLine();
                                    for (int i = 0; i < scount; i++) {
                                        if ((std_arr[i].getStudentName()).contains(name)) {
                                            System.out.println();
                                            System.out.print("Student Found, " +
                                                    std_arr[i].toString());
                                        }
                                    }
                                } else if (search_option == 2) {
                                    System.out.print("Enter The Student ID : ");
                                    int id = input.nextInt();
                                    for (int i = 0; i < scount; i++) {
                                        if ((std_arr[i].getStudentId()) == id) {
                                            System.out.println();
                                            System.out.print("Student Found, " +
                                                    std_arr[i].toString());
                                        }
                                    }
                                }
                                break;
                            }
                            case 'b': {
                                print();
                                System.out.println("Press '1' To Search By Name and '2' To Search By ID ");
                                break;
                            }
                            case 'c': {
                                print();
                                System.out.println("Press '1' To Search By Name and '2' To Search By ID ");
                                int search_option = input.nextInt();
                                if (search_option == 1) {
                                    System.out.print("Enter The Faculty Name : ");
                                    String name = input.nextLine();
                                    for (int i = 0; i < fcount; i++) {
                                        if ((faculty_arr[i].getFacultyName()).contains(name)) {
                                            System.out.println();
                                            System.out.print("Faculty Found, " +
                                                    faculty_arr[i].toString());
                                        }
                                    }
                                } else if (search_option == 2) {
                                    System.out.print("Enter Faculty ID : ");
                                    int id = input.nextInt();
                                    for (int i = 0; i < fcount; i++) {
                                        if ((faculty_arr[i].getFacultyId()) == id) {
                                            System.out.println();
                                            System.out.print("Faculty Found, " +
                                                    faculty_arr[i].toString());
                                        }
                                    }
                                }
                                break;
                            }
                            case 'd': {
                                print();
                                System.out.println("Enter The Student ID: ");
                                int std_mame = input.nextInt();
                                System.out.println("Enter The Course ID: ");
                                String courseid = input.nextLine();
                                int index = -1, index2 = -1;
                                for (int i = 0; i < ccount; i++) {
                                    if (courseid.equalsIgnoreCase(course_arr[i].getCourseId())) {
                                        index = i;
                                    }
                                }
                                if (index != -1) {
                                    for (int i = 0; i <

                                            course_arr[index].getNumberOfStudents(); i++) {
                                        if (course_arr[index].getStudentId(i) == std_mame) {
                                            index2++;
                                        }
                                    }
                                } else {
                                    System.out.println("Course Not Found !");
                                }
                                for (int i = 0; i < ccount; i++) {
                                    for (int j = 0; j <

                                            course_arr[i].getNumberOfStudents(); j++) {
                                        System.out.println(i + " " + j +
                                                " " +
                                                course_arr[i].getStudentId(j) + " " + std_mame);
                                        if (course_arr[i].getStudentId(j) == std_mame) {
                                            System.out.println(course_arr[i].toString());
                                            index++;
                                            System.out.println(i + " " +
                                                    j + " " +
                                                    course_arr[i].getStudentId(j) + " " + std_mame);
                                            index++;
                                            System.out.println(index);
                                            System.out.println("Student Has Taken Course ");
                                        }
                                    }
                                }
                                if (index2 == -1) {
                                    System.out.println("Student Has Not Taken Course ");
                                } else {
                                    System.out.println("Student Has Taken Course ");
                                }
                                System.out.println("Student Has Taken "
                                        + index + " Courses");
                                break;
                            }
                            case 'e': {
                                print();
                                System.out.println("Enter The Faculty ID: ");
                                int std_mame = input.nextInt();
                                System.out.println("Enter The Course ID: ");
                                String courseid = input.nextLine();
                                int index = -1, index2 = -1;
                                for (int i = 0; i < ccount; i++) {
                                    if (courseid.equalsIgnoreCase(course_arr[i].getCourseId())) {
                                        index = i;
                                    }
                                }
                                if (index != -1) {
                                    if (course_arr[index].getFacultyId() == std_mame) {
                                        index2++;
                                    }
                                } else {
                                    System.out.println("Course Not Found !");
                                }
                                if (index2 == -1) {
                                    System.out.println("Faculty Takes The Course ");
                                } else {
                                    System.out.println("Faculty Does Not Taken Course ");
                                }
                                break;
                            }
                            case 'f': {
                                print();
                                System.out.println("Enter The Stundent ID : ");
                                int std_name = input.nextInt();
                                System.out.println("Enter The Course ID: ");
                                String courseid = input.nextLine();
                                System.out.println("Courses Taken By Student Are : ");
                                int index = -1;
                                for (int i = 0; i < ccount; i++) {
                                    for (int j = 0; j <

                                            course_arr[i].getNumberOfStudents(); j++) {
                                        System.out.println(i + " " + j +
                                                " " +
                                                course_arr[i].getStudentId(j) + " " + std_name);
                                        if (course_arr[i].getStudentId(j) == std_name) {
                                            System.out.println(course_arr[i].toString());
                                            index++;
                                            System.out.println(i + " " +
                                                    j + " " +
                                                    course_arr[i].getStudentId(j) + " " + std_name);
                                            index++;
                                            System.out.println(index);
                                            System.out.println("Student Has Taken The Course ");
                                        }
                                    }
                                }
                                System.out.println("Total " + (index +
                                        1) + " Courses");
                                if (index == -1) {
                                    System.out.println("Student Has Not Taken Any Courses ");
                                }
                                break;
                            }
                            case 'g': {
                                print();
                                System.out.println("Enter The Faculty ID: ");
                                int std_mame = input.nextInt();
                                System.out.println("Enter The Course ID: ");
                                String courseid = input.nextLine();
                                System.out.println("Courses Taken By This Faculty Are : ");
                                int index = -1;
                                for (int i = 0; i < ccount; i++) {
                                    for (int j = 0; j <

                                            course_arr[i].getNumberOfStudents(); j++) {
                                        System.out.println(i + " " + j +
                                                " " +
                                                course_arr[i].getStudentId(j) + " " + std_mame);
                                        if (course_arr[i].getFacultyId() == std_mame) {
                                            System.out.println(course_arr[i].toString());
                                            index++;
                                            System.out.println(i + " " +
                                                    j + " " +
                                                    course_arr[i].getStudentId(j) + " " + std_mame);
                                            index++;
                                            System.out.println("Student Has Taken The Course ");
                                        }
                                    }
                                }
                                System.out.println("Total " + (index +
                                        1) + " Courses");
                                if (index == -1) {
                                    System.out.println("Student Has nNot Taken Any Courses ");
                                }
                                break;
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Not Results Showing !!!");
                    }
                        break;
                }
            }
        }
    }

    public static void print() {
    }
}

class Student {
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    private int studentId;
    private String studentName;
    private double CGPA;

    public Student() {
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.CGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student ID : " + studentId + "Student Name : " +
                studentName + "Student CGPA : " + CGPA;
    }
}

class Course {
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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

    public Student[] getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(Student[] studentlist) {
        this.studentlist = studentlist;
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

    public static int getStudent_counter() {
        return student_counter;
    }

    public static void setStudent_counter(int student_counter) {
        Course.student_counter = student_counter;
    }

    public int getStudentId(int n) {
        return studentlist[n].getStudentId();
    }

    public int getFacultyId() {
        return faculty.getFacultyId();
    }

    @Override
    public String toString() {
        return "Course{" + "Course ID : " + courseId + ", Course Title : " + courseTitle + ", Course Credit : " + credit
                + ", NumberOfStudents : " + numberOfStudents + ", Faculty : " +
                faculty +
                '}';
    }

    private String courseId;
    private String courseTitle;
    private double credit;
    Student[] studentlist = new Student[40];
    private int numberOfStudents = -1;
    private Faculty faculty;
    static int student_counter = 0;

    public Course() {
        this.numberOfStudents++;
        student_counter++;
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents++;
        student_counter++;
    }

    public void addStudent(Student std) {
        System.out.println(numberOfStudents + "Active Student " +
                student_counter + " Times");
        this.studentlist[numberOfStudents] = std;
        student_counter++;
        numberOfStudents++;
        System.out.println(student_counter);
        System.out.println(numberOfStudents + "Active Student " +
                student_counter + " Times");
    }

    public void dropStudent(int studentId) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentlist[i].getStudentId() == studentId) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Student Not Found !");
        } else {
            for (int i = index; i < numberOfStudents - 1; i++) {
                studentlist[i] = studentlist[i + 1];
            }
            studentlist[numberOfStudents] = null;
            numberOfStudents--;
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        System.out.println(numberOfStudents);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentlist[i].toString());
        }
    }
}

class Faculty {
    @Override
    public String toString() {
        return "Faculty{" + "Faculty ID : " + facultyId + ", Faculty Name : " + facultyName + ", Faculty Position : "
                + facultyPosition
                +
                '}';
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
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

    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {
    }

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
}