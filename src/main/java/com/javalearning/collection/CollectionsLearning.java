package com.javalearning.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsLearning {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, 5, 12, 5, 5, 67);
        Collections.sort(list); // sort
        list.forEach(System.out::println);
        System.out.println("------------------------");
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::println);

        System.out.println("-----------Binary Search (Log N)-----------");
        Collections.sort(list);
        int i = Collections.binarySearch(list, 67);
        System.out.println("Index: " + i);

        System.out.println("------------------------");
        List<String> stringList = new ArrayList<>(Arrays.asList("Mohit", "Aman", "Rohan", "Jay"));
        Collections.reverse(stringList);
        stringList.forEach(System.out::println);

        System.out.println("------------------------");
        Collections.shuffle(stringList);
        stringList.forEach(System.out::println);

        System.out.println("-----------Min & Max-------------");
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        Account account = new Account(Arrays.asList("T1", "T2", "T3"));
        account.getStatements().forEach(System.out::println);
        //account.getStatements().add("Hack T4");
        account.getStatements().forEach(System.out::println);

        System.out.println("------------------------");
        List<String> l1 = Arrays.asList("A", "B", "C", "D");
        Collections.fill(l1, "Z");
        l1.forEach(System.out::println);
        Collections.copy(stringList, l1);
        System.out.println("------------------------");
        stringList.forEach(System.out::println);


        System.out.println("------------------------");

        Collections.replaceAll(list, 5, 55);
        list.forEach(System.out::println);
        List<String> l2 = Arrays.asList("A", "B", "C", "D", "A", "A");
        System.out.println("------------------------");
        Collections.swap(l2, 1, 2);
        l2.forEach(System.out::println);
        System.out.println("------------------------");
        Collections.rotate(l2, -2); // left
        //Collections.rotate(l2, 2);  //right
        l2.forEach(System.out::println);
        System.out.println("------------------------");

        System.out.println(Collections.frequency(l2, "A"));

        List<String> dj1 = Arrays.asList("A", "B", "C", "D", "A", "A");
        List<String> dj2 = Arrays.asList("A", "Z");
        List<String> dj3 = Arrays.asList("X", "Y");

        System.out.println("------------------------");

        System.out.println(Collections.disjoint(dj1, dj2));
        System.out.println(Collections.disjoint(dj1, dj3));
        List<String> a = Collections.singletonList("A");
        print(a);
        Set<String> set = Collections.singleton("A");
        Map<String, Integer> apple = Collections.singletonMap("Apple", 1);
        List<Object> objects = Collections.emptyList();

        //printV2(null, "dks", "sdjfs");
        printV2(Collections.emptyList(), "dks", "sdjfs");

        List<String> repeatedList = new ArrayList<>(Collections.nCopies(5, "Apple"));
        repeatedList.forEach(System.out::println);

        Collections.addAll(repeatedList, "Mango", "Orange");
        repeatedList.forEach(System.out::println);
    }

    private static void print(List<String> list) {

    }

    private static void printV2(List<String> list, String var1, String var2) {
        list.contains("asjkdasj");
    }
}
