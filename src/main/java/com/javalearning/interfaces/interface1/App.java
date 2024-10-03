package com.javalearning.interfaces.interface1;

public class App {

    public static void main(String[] args) {
        Hr hr = new Hr("Kunal", "test@gmail.com", "1234", 44.5);
        displayAccountInfo(hr);
        displayEmployeeDetails(hr);
    }

    public static void displayAccountInfo(AccountDetails accountDetails) {
        System.out.println(accountDetails.getSalary());
    }

    public static void displayEmployeeDetails(EmployeeDetails employeeDetails) {
        System.out.println(employeeDetails.getName());
        System.out.println(employeeDetails.getEmail());
    }
}
