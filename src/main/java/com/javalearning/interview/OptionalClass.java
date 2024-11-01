package com.javalearning.interview;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        String name = "Mohit";
        Optional<String> opt = Optional.ofNullable("Mohit");
        if(name != null) {
            System.out.println(name);
            //...
        }
        opt.ifPresent(System.out::println);
    }
}
