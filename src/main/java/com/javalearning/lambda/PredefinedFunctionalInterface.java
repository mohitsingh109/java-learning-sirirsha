package com.javalearning.lambda;

import com.javalearning.inheritance.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionalInterface {
    public static void main(String[] args) {

        // 4 FI
        // Predicate<T>: take a single argument and return a boolean value
        // Function<T, R>: take a single argument and return a result
        // Consumer<T>: take a single argument and return nothing
        // Supplier<T>: take no argument and return a result

        Predicate<String> isEmpty = (s) -> s.isEmpty();
        System.out.println(isEmpty.test("Mohit"));

        Predicate<Integer> isLessThen100 = (v) -> v < 100;

        System.out.println(isLessThen100.test(10));
        System.out.println(isLessThen100.test(200));

        Person person = new Person("Mohit", "bla bla", "test@gmail.com");
        Function<Person, String> personFullDetail = (p) -> p.getName() + " " + p.getEmail();

        String personDetail = personFullDetail.apply(person);
        System.out.println(personDetail);

        Consumer<String> consumer = (c) -> {
            System.out.println(c);
        };

        List<String> name = Arrays.asList("Mohit", "Karan", "LL");

    }
}
