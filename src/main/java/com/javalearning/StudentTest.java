package com.javalearning;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("siri", 23, "1234", 56.5);
        Student student3 = new Student("avi", 21, "2345");
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
        System.out.println("Student 1 honorRoll : " + student1.isHonorRoll());
        System.out.println("Student 2 honorRoll : " + student2.isHonorRoll());
        System.out.println("Student 3 honorRoll : " + student3.isHonorRoll());

        System.out.println("total students : " + Student.totalStudents);
        System.out.println("average GPA : " + Student.getAverageGPA());


    }

}
