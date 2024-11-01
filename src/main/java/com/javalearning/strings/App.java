package com.javalearning.strings;

public class App {

    public static void main(String[] args) {
        String test = "apple,mango,banna"; // char[]

        if(test.isEmpty()) { //""
            System.out.println("test is empty");
        }

//        if(test.isBlank()) {//"" "    "
//            System.out.println("test is Blank");
//        }

        String trim = test.trim();
        System.out.println(trim);

        System.out.println(test.length());

        System.out.println(test.toLowerCase());

        System.out.println(test.toUpperCase());

        String[] split = test.split(",");

        for(String fruit: split) {
            System.out.println(fruit);
        }

        char c = test.charAt(1);
        System.out.println(c); // p

        String substring = test.substring(2, 5);
        System.out.println(substring);

        // Mohit mohit equals: false
        //Mohit mohit eIc: true
        boolean test1 = test.equals("test");
        boolean ajsdhsa = test.equalsIgnoreCase("ajsdhsa");

        boolean mango = test.contains("mango");

        String email = "<html> Name: $name$ </html>";

        String replace = email.replace("$name$", "Mohit Singh");

        boolean a = test.startsWith("a");
        boolean na = test.endsWith("na");

        String s1 = "a";
        String s2 = "b";
        String concat = s1.concat(s2);
        System.out.println(concat);
    }
}
