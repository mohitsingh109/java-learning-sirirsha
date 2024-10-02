package com.javalearning.inheritance;

/**
 * Person ---> Student [Simple or Single Inheritance]
 */
public class Student extends Person {

    private String course;

    private Integer year;

    public Student(String name, String address, String email, String course, Integer year) {
        super(name, address, email);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //function overriding
    @Override
    public void printDetails() {
        System.out.println("Course: "+ course + " Year: " + year);
    }

    //function hiding
    public static void f1() {
        System.out.println("f1 hiding");
    }
}
