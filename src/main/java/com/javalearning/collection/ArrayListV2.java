package com.javalearning.collection;

public class ArrayListV2 {

    private int[] arr;

    private int size = 0;

    public ArrayListV2() {
        arr = new int[5];
        size = 0;
    }

    public void add(int value) {
        if(size == arr.length) {
            resize();
        }
        arr[size] = value;
        size++;
    }

    public void resize() {
        int[] temp = new int[size * 2];
        //clone
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    public int size() {
        return size;
    }
}
