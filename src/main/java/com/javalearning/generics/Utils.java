package com.javalearning.generics;

import java.util.List;

public class Utils {

    public static <T> void printArray(T[] arr) {
        for(T element: arr) {
            System.out.println(element);
        }
    }

    // Upper Bounded wildcards
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for(Number num : list) {
            sum += num.doubleValue();
        }

        return sum;
    }

    //Lower Bounded Wildcards
    public static void addToList(List<? super Integer> list) {
        list.add(10);
    }

}
