package com.javalearning.inheritance;

public class Person {
    private String name;

    private String address;

    private String email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printDetails() {
        System.out.println("Name: " + name + " Address: " + address + " Email: " + email);
    }

    public static void f1() {
        System.out.println("f1");
    }
}
