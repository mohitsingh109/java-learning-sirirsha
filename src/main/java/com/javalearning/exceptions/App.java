package com.javalearning.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {

        // Checked Exception force  [Exception class]

        try {
            checkedException(); // login s1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // login s2
            System.out.println("handle checked exception");
        }


        String name = "sdkhfskf";

        if(name.length() <= 2) {
            throw new IllegalArgumentException("string length is less then 2");
        }

        // UnChecked Exception [RunTimeException class]
        //uncheckedException();

        try {
            myCustomCheckedException();
        } catch (CustomCheckedException e) {
            System.out.println("User is already exist");
            System.out.println(e.getMessage());
        }

        try {
            int result = 10 / 0;

        } catch (ArithmeticException ae) {
            System.out.println("dived by 0 not allowed");
        } finally {
            System.out.println("release database resources");
        }

        throw new CustomUnCheckedException("m");

    }

    private static void checkedException() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader reader = new FileReader(file);
        System.out.println("I am happy");
    }

    //spring boot
    //f1() ---> f2() ---> f3() ---> f4() ---> f5()
    private static void uncheckedException() {
        String name = null;
        name.toLowerCase();
    }

    private static void myCustomCheckedException() throws CustomCheckedException {
        boolean userFound = true;
        if(userFound) {
            throw new CustomCheckedException("123");
        }
    }
}
