package com.javalearning.inheritance;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Mohit", "A1", "test@gmail.com", "Java", 2);
        student.printDetails();
        Student.f1();
    }
}
