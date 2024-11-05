package com.javalearning.datastructure.arrays;

import java.util.HashSet;

public class ArrayDSCheckDuplicate {


    public static boolean checkDuplicate(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int value = arr[i]; // 2
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] == value) {
                    return false;
                }
            }
        }

        /**
         * Space Complexity: O(1)
         * Time Complexity: O(N^2)
         */
        return true;
    }

    public static boolean checkDuplicateON(int[] arr) {

        //{1, 2, 3, 4, 5}
        //    1  1   1  1
        //        2  2  2
        //           3  3
        HashSet<Integer> set = new HashSet<>();

        // {1, 2, 3, 4, 5}

        for(int value: arr) {
            if(set.contains(value)) { // O(1)
                return false;
            }
            set.add(value); // O(1)
        }

        /**
         * Space Complexity: O(N)
         * Time Complexity: O(N)
         */
        return true;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 1}; // false
        int[] test2 = {4, 5, 6, 7, 8}; // true
        int[] test3 = {4, 5, 4, 7, 5}; // false

        System.out.println(checkDuplicateON(test1));
        System.out.println(checkDuplicateON(test2));
        System.out.println(checkDuplicateON(test3));
    }
}
