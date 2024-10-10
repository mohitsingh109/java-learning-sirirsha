package com.javalearning.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mohit"); // 0
        list.add("Rohit"); // 1
        list.add("Mohit"); // 2
        list.remove(0);
        //list.removeAll(Arrays.asList("Mohit"));
        list.remove("Mohit");
        System.out.println(list.size());
        list.add("Dummy");
        list.set(1, "Karan"); // update
        boolean sirisha = list.contains("Sirisha");
        list.forEach(System.out::println);
        String s = list.get(1);
        System.out.println(s);
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        String[] arr = {"N1", "N2", "N3"};
        List<String> l1 = Arrays.asList("N1", "N2", "N3");

        list.add("always last");
        list.add(1, "Dipti");
        list.addAll(Arrays.asList("N1", "N2", "N3"));
        list.addAll(l1);
        list.addFirst("Hello"); //0
        //list.add(0, "karan");

        // Ordered collection that allow duplicate values
        // Insertion order is maintained & positional access

        //AL Middle insert/update(you don't know the index)/delete costly
        //Capacity full resize is costly

        List<String> ll = new LinkedList<>(Arrays.asList("Mohit", "Karan"));
        ll.add("heelo");
        ll.remove(0);
        ll.remove("hello");
        //String s1 = ll.get(100);// slow

        // Ordered collection that allow duplicate values
        // Insertion order is maintained & positional access

        // Iterator
        // for lop

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(30);
        intList.add(30);
        intList.add(30);
        intList.add(40);
        intList.add(30);
        intList.add(50);

//        for(int i = 0; i < intList.size(); i++) {
//            if(intList.get(i) == 30) {
//                intList.remove(i);
//                i--; // hack
//            }
//        }
//
//        for(int i = 0; i < intList.size(); i++) {
//            System.out.println(intList.get(i));
//        }

        Iterator<Integer> itr = intList.iterator();
        while (itr.hasNext()) { // is there any value present
            Integer value = itr.next(); // give the value
            if(value == 30) {
                itr.remove();
            }
        }

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}


// f1() --> f2() --> f3() --> f4()