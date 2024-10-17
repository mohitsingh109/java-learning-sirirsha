package com.javalearning.polymorphism;

import java.util.Date;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Mohit", 10.5, "21");
        Manager manager = new Manager("Karan", 22.4, "Ops");
        // Hr.java
        // SVP.java
        //...1000
        javaDeveloper.addBonus(10);
        manager.addBonus(10);

        //10$ all employee
        Employee[] employees = {javaDeveloper, manager}; // (select * from table)

        for(Employee e: employees) {
            e.addBonus(10);
        }
        printDetails(javaDeveloper);
        printDetails(manager);

        Employee employee = new Employee("Mohit", 45.655);
        employee.setSalary(5654.45645);

        Date date = new Date();
        System.out.println(date);

    }

    private static void printDetails(Employee e) { // e?
        System.out.println(e.getName());
    }
}
