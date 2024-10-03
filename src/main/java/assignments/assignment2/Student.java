package assignments.assignment2;

public class Student {

    private String name;
    private int age;
    private String studentID;
    private double gpa;

    public static int totalStudents = 0;
    public static Double totalGPA = 0.0;

    public Student() {
        totalStudents++;
        totalGPA += getGpa();
    }

    public Student(String name, int age, String studentID, double gpa) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gpa = gpa;
        totalStudents++;
        totalGPA += getGpa();

    }

    public Student(String name, int age, String studentID) {
        this(name, age, studentID, 70.5);
        totalStudents++;
        totalGPA += getGpa();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isHonorRoll() {
        if (getGpa() >= 3.5)
            return true;
        else
            return false;
    }

    public void printDetails() {
        System.out.println("name : " + getName());
        System.out.println("age : " + getAge());
        System.out.println("Student ID : " + getStudentID());
        System.out.println("GPA : " + getGpa());
    }

    public static Double getAverageGPA() {
        return totalGPA / totalStudents;
    }

}
