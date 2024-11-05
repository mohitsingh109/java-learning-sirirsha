package com.javalearning.datastructure.arrays;

public class ArrayDBMergeSortedArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i, j, k;
        i = j = k = 0;

        while (i < n1 && j < n2) { // false
            if(arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        //if element are present at the end of arr1
        while (i < n1) {
            result[k] = arr1[i];
            k++;
            i++;
        }

        //if element are present at the end of arr2
        while (j < n2) {
            result[k] = arr2[j];
            k++;
            j++;
        }

        return result;

        /**
         * Space Complexity: O(N + M)
         * Time Complexity: O(N + M)
         */

    }

    public static void main(String[] args) {
        int[] arr1 = {10, 40, 45, 80, 85, 90, 100, 111, 144};
        int[] arr2 = {20, 35, 44, 67, 99};

        //Merge 2 sorted array.
        //Merge N sorted array?
        int[] results = mergeSortedArray(arr1, arr2);
        for(int value: results) {
            System.out.print(value + ", ");
        }

        System.out.println();
    }
}
