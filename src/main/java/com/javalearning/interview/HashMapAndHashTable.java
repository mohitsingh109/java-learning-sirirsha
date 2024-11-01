package com.javalearning.interview;

import java.util.Hashtable;

public class HashMapAndHashTable {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("k1", "v1");

        // both are key value data store
        // Hashtable is thread safe while hashmap is not
    }
}
