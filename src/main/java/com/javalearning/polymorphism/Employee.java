package com.javalearning.polymorphism;

public class Employee {

    private String name;

    private double salary;



    private static int totalEmployee = 0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void addBonus(double bonus) {
        salary = salary + bonus;
    }
}
