package com.javalearning.datastructure.arrays;

public class ArraysDSMINMAX {

    // 1) Finding the Maximum or Minimum Element in an Array

    //{10, 20, 11, 4, 55} return 55
    public static int findMax(int[] arr) {
        //{10, 20, 11, 4, 55}
    //(-1)  | (10)
        //      | (20)
        //          | (20)
        //              | (20)
        //                  | (55)

        if(arr.length == 0) {
            //throw new RunTimeException("Array cannot be empty");
            System.out.println("Array is empty");
            return -1;
        }

        int currentMax = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > currentMax) { // 55 > 20
                currentMax = arr[i]; // 50
            }
        }

        return currentMax; // 55
    }


    //{10, 20, 11, 4, 55} min: 4
    public static int findMin(int[] arr) {
        //{10, 20, 11, 4, 55}
        // |(10)
        //      |(10)
        //          |(10)
        //              |(4)
        //                  |(4)

        if(arr.length == 0) {
            //throw new RunTimeException("Array cannot be empty");
            System.out.println("Array is empty");
            return -1;
        }

        int currentMin = arr[0];

        for(int i = 0; i < arr.length; i++) { //{10, 20, 11, 4, 55}
            if(currentMin > arr[i]) { // 4 > 55
                currentMin = arr[i]; // 4
            }
        }

        return currentMin;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 20, 11, 4, 55};
        int[] test2 = {-10, -2, -6, -4};
        int[] test3 = {-10, 2, -6, 1};
        int[] test4 = new int[0]; // edge cases

//        System.out.println(findMax(test1));
//        System.out.println(findMax(test2));
//        System.out.println(findMax(test3));
//        System.out.println(findMax(test4));

        System.out.println(findMin(test1));
        System.out.println(findMin(test2));
        System.out.println(findMin(test3));
        System.out.println(findMin(test4));
    }
}
