package com.javalearning.generics;

public class Box <T, K> {

    private T value;

    private K key;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
