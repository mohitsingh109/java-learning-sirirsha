package com.javalearning.interfaces.interface1;

public class Hr extends Person implements AccountDetails{ // is a relationship

    private String accountNumber;

    private double salary;

    public Hr(String name, String email, String accountNumber, double salary) {
        super(name, email);
        this.accountNumber = accountNumber;
        this.salary = salary;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
