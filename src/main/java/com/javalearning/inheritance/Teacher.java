package com.javalearning.inheritance;

/**
 * Person ---> Teacher
 *        ---> Student
 *
 *        Hierarchical Inheritance
 */
public class Teacher extends Person {

    private String subject;

    private double salary;

    public Teacher(String name, String address, String email, String subject, double salary) {
        super(name, address, email);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
