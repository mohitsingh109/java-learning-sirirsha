package com.javalearning.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingQueue;

public class SetCollection {

    public static void main(String[] args) {
        // Set (I)
        // HashSet (C) // MAX
        // TreeSet (C) // large (upper limit is not know use this)
        // LinkedHashSet (C)

        List<String> al = new ArrayList<>();
        al.add("Mohit");
        al.add("Karan");
        al.add("Sirirsha");
        al.add("Meenu");

        // duplicate add should not be there
        // contains fast

       addValue("Karan", al); // O(N)
       addValue("Mohit", al); // O(N)
       addValue("Unique1", al); // O(N) N = number of record in array

        //al.forEach(System.out::println);

        Set<String> hs = new HashSet<>();  // ??
        hs.add("Mohit");
        hs.add("Karan");
        hs.add("Mohit"); // O(N) //O(1)  14
        hs.add("N1");
        hs.add("N2");
        hs.add("N3");

        // it doesn't allow duplicate records
        // insert or delete O(Log2 N)
        // Not a order collection

//        for(String value: hs) {
//            System.out.println(value);
//        }


        Set<String> ts = new TreeSet<>();
        // Increase order maintain
        // inset delete update get log2N
        ts.add("Z");
        ts.add("D");
        ts.add("A");
        ts.add("P");
        ts.add("R");
        ts.add("F");
        ts.remove("Z");

//        for(String value: ts) {
//            System.out.println(value);
//        }

        Set<String> lhs = new LinkedHashSet<>(); // HashSet O(1), O(N), log2N
        //Insertion order is maintained
        lhs.add("Z");
        lhs.add("D");
        lhs.add("A");
        lhs.add("P");
        lhs.add("R");
        lhs.add("F");

        for(String value: lhs) {
            System.out.println(value);
        }

        LinkedBlockingQueue<Object> objects = new LinkedBlockingQueue<>();

    }

    private static void addValue(String value, List<String> al) {
        if(!al.contains(value)) {
            al.add(value);
        }
    }
}
