package com.javalearning.interview;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;
    private final Integer age;
    private final Address address;
    private final List<String> skills = new ArrayList<>();

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        skills.add("Java");
        skills.add("Spring boot");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address.getCity());
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", skills=" + skills +
                '}';
    }
}
