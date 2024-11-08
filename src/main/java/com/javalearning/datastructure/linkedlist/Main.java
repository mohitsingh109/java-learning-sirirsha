package com.javalearning.datastructure.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(300);
        linkedList.addFirst(5);

        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.display();
    }
}
