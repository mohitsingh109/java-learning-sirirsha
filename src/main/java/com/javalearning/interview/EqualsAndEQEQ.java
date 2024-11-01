package com.javalearning.interview;

public class EqualsAndEQEQ extends Object {

    public static void main(String[] args) {
        String s1 = "Mohit";
        //String s2 = "Mohit";
        String s2 = new String("Mohit");

        int value = 10;
        if(value == 10) {
            System.out.println("Yes");
        }

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
