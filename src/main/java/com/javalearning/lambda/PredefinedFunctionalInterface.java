package com.javalearning.lambda;

import com.javalearning.inheritance.Person;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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


        Predicate<String> isEmailValid = email -> email.contains("@");
        System.out.println(isEmailValid.test("test@gmail.com"));


        Function<Double, Double> applyDiscount = price -> price * 0.9;
        System.out.println(applyDiscount.apply(100.10));

        Supplier<List<String>> top10User = () -> Arrays.asList("Mohit", "Karan");
        Supplier<String> randomId = () -> UUID.randomUUID().toString();

        System.out.println(top10User.get());
        System.out.println(randomId.get());

        Consumer<String> logger = msg -> System.out.println("Log: " + msg);


        // BiFunction - similar to Function but takes two argument

        BiFunction<String, String, String> concatFunction = (s1, s2) -> s1 + s2;
    }
}
