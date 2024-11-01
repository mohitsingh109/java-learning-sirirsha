package com.javalearning.interview;

public class TestImmutableClass {

    public static void main(String[] args) {
        Person person = new Person("Mohit", 28, new Address("Panchkula"));

        Address address = person.getAddress();
        address.setCity("Hack");
        person.getSkills().clear();
        System.out.println(person);
    }
}
