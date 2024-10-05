package com.javalearning.strings;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        String s1 = "Mohit";
        String s2 = "Mohit";
        String s3 = new String("Mohit");

        if(s1 == s2) {
            System.out.println("same address");
        }

        if(s1 != s3) {
            System.out.println("Address are not same");
        }
    }

    private static void stringBuilderPrint() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("jsdfjsdfhdsjfhdjfhdsjfhd").append(i);
        }
        System.out.println(stringBuilder);
        System.out.println("end");
    }

    private static void stringPrint() {
        String test = "";

        for (int i = 0; i < 1000000; i++) {
            test = "jsdfjsdfhdsjfhdjfhdsjfhd" + i + test;
        }

        System.out.println(test);
        System.out.println("end");
    }
}
