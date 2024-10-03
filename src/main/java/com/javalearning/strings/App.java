package com.javalearning.strings;

public class App {

    public static void main(String[] args) {
        String test = "apple,mango,banna"; // char[]

        if(test.isEmpty()) { //""
            System.out.println("test is empty");
        }

        if(test.isBlank()) {//"" "    "
            System.out.println("test is Blank");
        }

        String trim = test.trim();
        System.out.println(trim);

        System.out.println(test.length());

        System.out.println(test.toLowerCase());

        System.out.println(test.toUpperCase());

        String[] split = test.split(",");

        for(String fruit: split) {
            System.out.println(fruit);
        }
    }
}
