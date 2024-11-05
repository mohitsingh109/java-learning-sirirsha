package com.javalearning.datastructure.arrays;

public class ArrayDSReverse {


    // two pointer approach

    /**
     * {10, 30, 50, 70, 77}
     *
     * {77, 70, 50, 30, 10}
     */

    public int max(int a, int b) {
        //a = 10, b = 5
        //a = 100, b = 500000
        // Time Complexity: O(1)
        if(a > b)
            return a;
        else
            return b;
    }

    //add(10) O(N)

    public static int[] reverseArrayWithTwoPointer(int[] arr) { // 100, 1000, 10000, 100000

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Time Complexity: O(N) // N = number of element in array
        // Space Complexity: O(1) //
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        // basic approach
        int[] newArr = new int[arr.length];
        int j = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }

        // Time Complexity: O(N) // N = number of element in array
        // Space Complexity: O(N) // N = number of element in array
        return newArr;
    }

    public static void main(String[] args) {

        // Time & Space Complexity
        // Big O
        int[] test1 = {10, 20, 11, 4, 55};
        int[] result = reverseArrayWithTwoPointer(test1);
        for(int r: result) {
            System.out.print(r + ", ");
        }
        System.out.println();
    }
}
