package com.practice;
import java.util.Scanner;

public class MethodPractice13 {

    static Scanner sc = new Scanner(System.in);

    class Employee {
        int id;
        String name;
        double salary;
    }

    // Create + return object
    Employee getEmployee() {
        Employee e = new Employee();

        System.out.print("Enter id: ");
        e.id = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.print("Enter name: ");
        e.name = sc.nextLine();

        System.out.print("Enter salary: ");
        e.salary = sc.nextDouble();

        return e;
    }

    // Display method
    void display(Employee e) {
        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }

    // Update salary and return object
    Employee update(Employee e) {
        System.out.print("Enter updated salary: ");
        e.salary = sc.nextDouble();
        return e;
    }

    public static void main(String[] args) {

        MethodPractice13 m = new MethodPractice13();

        Employee emp = m.getEmployee();  // create
        m.display(emp);                  // display

        emp = m.update(emp);             // update
        m.display(emp);                  // display updated

        sc.close();
    }
}
