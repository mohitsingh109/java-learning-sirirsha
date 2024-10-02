package com.javalearning.classandobject;

public class Person {

    private String name;

    private String address;

    private String email;

    private String phoneNumber;

    private final String cardNo;

    public Person(String name, String address, String email, String phoneNumber, String cardNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cardNo = cardNo;
    }

    public Person(String name, String cardNo) {
        this(name, null, null, null, cardNo);
    }

    public Person(String name, String email, String cardNo) {
        this(name, null, email, null, cardNo);
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNo() {
        return cardNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { // o = personB this=personA
        if (this == o) return true; // if(personA.equals(personA))
        if (!(o instanceof Person person)) return false; //if(personA.equals(new Calculator())) {

        if (!getName().equals(person.getName())) return false;
        if (!getAddress().equals(person.getAddress())) return false;
        if (!getEmail().equals(person.getEmail())) return false;
        if (!getPhoneNumber().equals(person.getPhoneNumber())) return false;
        return getCardNo().equals(person.getCardNo());
    }
}
