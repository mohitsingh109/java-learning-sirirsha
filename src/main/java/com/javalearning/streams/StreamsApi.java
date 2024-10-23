package com.javalearning.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        //iterateOverList();
        //filterAList();
        //transform();
        //countElement();
        //convertUserToNameList();
        //findFirst();
        //sum();
        //max();
        //joinString();
        //partitionDataEvenOdd();
        //groupByNameLength();
        //filterAndMapping();
        //distinct();
        //limitLoop();
        //skip3ValueInLoop();
        //sort();
    }

    public static void iterateOverList() {
        //old
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        for(String name: names) {
            System.out.println(name);
        }

        //streams
        //names.stream().forEach(n -> System.out.println(n));
        //names.forEach(n -> System.out.println(n));
        names.forEach(System.out::println); // Method Reference (ClassName::FunctionName)
    }

    public static void filterAList() {
        //old
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = new ArrayList<>();
        for(Integer number: numbers) { // loop
            if(number % 2 == 0) { // filter
                even.add(number);
            }
        }
        System.out.println(even);

        //streams
        List<Integer> result = numbers.stream() // loop
                .filter(n -> n % 2 == 0) // Predicate
                .toList();
    }

    public static void transform() {
        //old
        List<Integer> numbers = Arrays.asList(1, 2 ,3 ,4 ,5 ,6);
        List<Integer> squares = new ArrayList<>();

        for(Integer number: numbers) {
            squares.add(number * number); // 1 * 1 , 2 * 2
        }

        System.out.println(squares);

        //new
        List<Integer> result = numbers.stream() // loop
                .map(n -> n * n) // Function<T, R>
                .toList();
        System.out.println(result);
    }

    public static void countElement() {
        //old
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Mohit", "Karan");
        int count = 0;
        for(String name: names) {
            if(name.startsWith("J")) {
                count++;
            }
        }
        System.out.println("Count: " + count);

        //streams
        long result = names.stream()
                .filter(n -> n.startsWith("J"))
                .count();

        System.out.println("Count: " + result);
    }

    public static void convertUserToNameList() {
        //old
        List<User> users = Arrays.asList(new User("John", 23), new User("Mohit", 27));
        List<String> names = new ArrayList<>();

        for(User user: users) {
            names.add(user.getName());
        }

        System.out.println(names);

        //new
        List<String> result = users.stream()
                .map(User::getName)// Method Reference (ClassName::FunctionName)
                .toList();

        System.out.println(result);
    }

    public static void findFirst() {
        //old
        List<String> names = Arrays.asList("Mohit", "Abhinav", "Jack", "Jhon");

        String foundName = null;

        for(String name: names) {
            if(name.startsWith("J")) {
                foundName = name; // jack
                break; // take out of the loop
            }
        }

        System.out.println(foundName.toUpperCase());

        //Optional Java 8 to handle Null Pointer more easy way
        //streams
        Optional<String> foundNameOpt = names.stream()
                .filter(n -> n.startsWith("J"))
                .findFirst();

        foundNameOpt.ifPresent(s -> System.out.println(s.toUpperCase()));

        Optional<String> foundNameOpt1 = names.stream()
                .filter(n -> n.startsWith("J"))
                .findAny();

        foundNameOpt1.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    public static void sum() {
        //old
        List<Integer> numbers = Arrays.asList(1, 2 ,3 ,4 ,5);
        int sum = 0;

        for(int number: numbers) {
            sum += number;
        }

        System.out.println(sum);

        //streams
        int result = numbers.stream()
                .mapToInt(Integer::intValue) // Method Reference
                .sum();

        System.out.println(result);
    }

    public static void max() {
        //old
        List<Integer> numbers = Arrays.asList(1, 5 ,3 ,4 ,2);
        int max = Integer.MIN_VALUE;

        for(int number: numbers) {
            if(number > max) {
                max = number;
            }
        }

        System.out.println(max);

        //streams
        OptionalInt result = numbers.stream()
                .mapToInt(Integer::intValue) // Method Reference
                .max(); // min() // average()

        result.ifPresent(System.out::println);
    }

    public static void joinString() {
        //old
        List<String> names = Arrays.asList("John", "Jack", "Mohit");
        String resultName = "";

        for(String name: names) {
            resultName = resultName + name + ", ";
        }

        System.out.println(resultName);

        //stream
        String result = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void  partitionDataEvenOdd() {
        //old
        List<Integer> numbers = Arrays.asList(1, 5 ,3 ,4 ,2, 20, 43, 23, 46);
        Map<Boolean, List<Integer>> partition = new HashMap<>();
        partition.put(true, new ArrayList<>()); // even
        partition.put(false, new ArrayList<>()); // odd
        /**
         *
         * true -> []
         * false -> []
         *
         * true -> [4, 2, 20, 46]
         * false -> [1, 5, 3, 43, 23]
         */

        for(Integer value: numbers) {
            if(value % 2 == 0) { //even
                partition.get(true).add(value);
            } else { //odd
                partition.get(false).add(value);
            }
        }

        System.out.println("true --> " + partition.get(true));
        System.out.println("false --> " + partition.get(false));

        //Steams
        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("S true --> " + result.get(true));
        System.out.println("S false --> " + result.get(false));
    }

    public static void groupByNameLength() {
        //old
        List<String> names = Arrays.asList("John", "Jack", "Mohit", "Karan", "Abhinave");

        /**
         * 4 -> [John, Jack]
         * 5 -> [Mohit, Karan]
         * 8-> [Abhinave]
         */

        Map<Integer, List<String>> groupByLength = new HashMap<>();

        for(String name: names) {
            int length = name.length();
            groupByLength.putIfAbsent(length, new ArrayList<>());
            groupByLength.get(length).add(name);
        }

        groupByLength.forEach((k, v) -> System.out.println( k + " --> " + v));


        //stream
        Map<Integer, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(String::length));

        result.forEach((k, v) -> System.out.println("Steam: " + k + " --> " + v));
    }

    public static void filterAndMapping() {
        //name
        List<String> names = Arrays.asList("John", "Jack", "Mohit", "Karan", "Abhinave");
        List<String> upperCaseName = new ArrayList<>();

        for(String name: names) {
            if(name.length() > 4) {
                upperCaseName.add(name.toUpperCase());
            }
        }

        System.out.println(upperCaseName);

        //streams

        List<String> result = names.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }

    public static void distinct() {
        List<Integer> number = Arrays.asList(1, 1, 2, 2 ,3, 44, 5, 66);
        List<Integer> distinct  = new ArrayList<>();

        for(Integer n: number) {
            if(!distinct.contains(n)) {
                distinct.add(n);
            }
        }

        System.out.println(distinct);

        // stream
        List<Integer> result = number.stream()
                .distinct()
                .toList();
        System.out.println(result);
    }

    public static void limitLoop() {
        List<Integer> number = Arrays.asList(1, 1);
        List<Integer> first3Number = new ArrayList<>();

        for(int index = 0; index < 3 && index < number.size(); index++) {
            first3Number.add(number.get(index));
        }

        System.out.println(first3Number);

        List<Integer> result = number.stream()
                .limit(3)
                .toList();
        System.out.println(result);
    }

    public static void skip3ValueInLoop() {
        List<Integer> number = Arrays.asList(1, 1, 3, 4, 5, 6, 7, 8);
        List<Integer> first3Number = new ArrayList<>();

        for(int index = 3; index < number.size(); index++) {
            first3Number.add(number.get(index));
        }

        System.out.println(first3Number);

        List<Integer> result = number.stream()
                .skip(3)
                .toList();
        System.out.println(result);
    }

    public static void sort() {
        List<String> names = Arrays.asList("Mohit", "John", "Abhinave", "Jack", "Karan");
        Collections.sort(names, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(names);

    }

}
