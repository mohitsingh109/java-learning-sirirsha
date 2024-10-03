package com.javalearning.interfaces.interface1;

public class Person implements EmployeeDetails{

    private String name;

    private String email;

    //....

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
