package com.javalearning.generics;

import com.javalearning.abstraction.Phone;
import com.javalearning.inheritance.Person;

public class NumberBox <T extends Number, K extends Person> { // Bounded type parameters

    private T value;

    private K person;

    private String name;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getPerson() {
        return person;
    }

    public void setPerson(K person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

