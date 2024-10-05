package com.javalearning.arrays;

import com.javalearning.polymorphism.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Arrays {
    public static void main(String[] args) {

        String[] comments = new String[100]; // DS

        Integer[] itg = new Integer[100];

        Employee[] employees = new Employee[100];

        int[] arr = {1, 2 ,3, 4, 5};

        for(int i = 0; i < arr.length; i++) { // DS
            System.out.println(arr[i]);
        }

        for(int data : arr) { // for each loop
            System.out.println(data);
        }
    }
}
