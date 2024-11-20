package com.javalearning.datastructure.linkedlist;

public class Node {

    int data; // data store // 8 bytes

    Node next; // pointer to the next node 8 bytes

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
