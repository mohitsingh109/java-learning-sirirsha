package com.javalearning.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCollection {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // O(1) -- O(N)
        map.put("k1", "Mohit");
        map.put("k2", "Value1");
        map.put("key3", "value34");
        //map.put("k1", "Mohit v2"); // update

        //map.remove("k1");

//        Map<String, String> map1 = new HashMap<>();
//        map.putAll(map1);

        map.replace("k1", "Mohit v3");
        System.out.println(map.size());
        System.out.println(map.keySet()); // print all the keys
        String value = map.get("k2");
        System.out.println(value);
        //v3
        //v1
        String value1 = map.getOrDefault("K2", "NON_VALUE");//NON_VALUE
        System.out.println(value1);

        Set<String> strings = map.keySet();
        System.out.println(strings);

        for(String key: map.keySet()) {
            System.out.println("key: " + key);
        }

        for(String data: map.values()) {
            System.out.println(data);
        }

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Integer, String> treeMap = new TreeMap<>(); // log N Tree
        //key are fetch in increasing order
        treeMap.put(10, "kdsfskd");
        treeMap.put(2, "dsklhfdsklf");
        treeMap.put(55, "dklfjdskf");

        for(Integer key: treeMap.keySet()) { // always give me increasing order
            System.out.println("key: " + key);
        }

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();  // O(1) -- O(N)
        //key order is maintained
        linkedHashMap.put(34, "kfaskfjas");
        linkedHashMap.put(21, "lfjskfjsa");
        linkedHashMap.put(55, "dkfdsklfdskfhs");

        for(Integer key: linkedHashMap.keySet()) { // always give me increasing order
            System.out.println("LHM key: " + key);
        }

        // Iterator


    }
}
