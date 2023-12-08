package Azmi06;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Employee Name : ");
        String name = input.nextLine();
        System.out.print("Enter The Employee Address : ");
        String address = input.nextLine();
        System.out.print("Enter The Employee Age : ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Employee Phone Number : ");
        int phonenumber = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Employee Salary : ");
        int salary = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Employee Specialization : ");
        String specialization = input.nextLine();
        System.out.print("Enter The Employee Department : ");
        String department = input.nextLine();
        Employee e = new Employee(specialization, department, name, address, age, phonenumber,
                salary);
        System.out.println();
        System.out.println(e.toString());
        System.out.println();
        System.out.print("Enter The Manager Name : ");
        name = input.nextLine();
        System.out.print("Enter The Manager Address : ");
        address = input.nextLine();
        System.out.print("Enter The Manager Age : ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Manager Phone Number : ");
        phonenumber = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Manager Salary : ");
        salary = Integer.parseInt(input.nextLine());
        System.out.print("Enter The Manager Specialization : ");
        specialization = input.nextLine();
        System.out.print("Enter The Manager Department : ");
        department = input.nextLine();
        Manager m = new Manager(specialization, department, name, address, age, phonenumber,
                salary);
        System.out.println();
        System.out.println(m.toString());
        System.out.println();
        input.close();
    }
}

class Member {
    String Name;
    String Address;
    int Age;
    int PhoneNumber;
    int Salary;

    Member() {
    }

    Member(String Name, String Address, int Age, int PhoneNumber, int Salary) {
        this.Name = Name;
        this.Address = Address;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return Age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public int getSalary() {
        return Salary;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
}

class Manager extends Member {
    String specialization;
    String department;

    Manager(String specialization, String department) {
        this.specialization = specialization;
        this.department = department;
    }

    Manager(String specialization, String department, String Name, String Address, int Age, int PhoneNumber,
            int Salary) {
        super(Name, Address, Age, PhoneNumber, Salary);
        this.specialization = specialization;
        this.department = department;
    }

 @Override
 public String toString() {
 return "Manager { " + "Manager Specialization : " + specialization + ", Manager Department : " + department + ", Manager Name : " + Name + ", Manager Address : " + Address
+ ", Manager Age : " + Age + ", Manager Phone Number : " + PhoneNumber + ", Manager Salary : " + Salary + " }";
}}

class Employee extends Member {
    String specialization;
    String department;

    Employee(String specialization, String department) {
        this.specialization = specialization;
        this.department = department;
    }

    Employee(String specialization, String department, String Name, String Address, int Age, int PhoneNumber,
            int Salary) {
        super(Name, Address, Age, PhoneNumber, Salary);
        this.specialization = specialization;
        this.department = department;
    }

 @Override
 public String toString() {
 return "Employee { " + "Employee Specialization : " + specialization + ", Employee Department : " + department + ", Employee Name : " + Name + ", Employee Address : " + Address + ", Employee Age : " + Age + ", Employee Phone Number : " + PhoneNumber + ", Employee Salary : " + Salary + " }";
}}
