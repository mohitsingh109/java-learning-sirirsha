package com.javalearning.generics;

import com.javalearning.inheritance.Person;
import com.javalearning.inheritance.Student;
import com.javalearning.polymorphism.Employee;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello"); // 0
        list.add(10); // 1
        list.add(10.5); // 2

        int i = (int) list.get(1);
        System.out.println(i);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        Integer i1 = list1.get(0);

        List<Person> list2 = new ArrayList<>();

        Box<Integer, String> integerBox = new Box<>();
        integerBox.setValue(10);
        Integer value = integerBox.getValue();
        Box<String, Float> stringBox = new Box<>();
        Box<Person, Employee> personBox = new Box<>();

        Integer[] arr1 = {10, 20, 30};
        String[] arr2 = {"hello", "world"};

        Utils.printArray(arr1); // Integer

        Utils.printArray(arr2); // String

        NumberBox<Integer, Student> intBox = new NumberBox<>();

    }
}
