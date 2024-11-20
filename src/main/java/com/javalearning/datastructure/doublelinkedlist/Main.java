package com.javalearning.datastructure.doublelinkedlist;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.insertAtFront(3);
        doubleLinkedList.insertAtFront(3);
        doubleLinkedList.insertAtFront(2);
        doubleLinkedList.insertAtFront(1);
        doubleLinkedList.insertAtEnd(2);
        doubleLinkedList.insertAtEnd(1);

        doubleLinkedList.forwardTraverse();
        //doubleLinkedList.backwardTraverse();

//        doubleLinkedList.deleteFrontNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteFrontNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteFrontNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteFrontNode();
//        doubleLinkedList.forwardTraverse();

//        doubleLinkedList.deleteEndNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteEndNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteEndNode();
//        doubleLinkedList.forwardTraverse();
//
//        doubleLinkedList.deleteEndNode();
//        doubleLinkedList.forwardTraverse();

        //doubleLinkedList.deleteByValue(30);
        //doubleLinkedList.deleteByValue(20);
//        doubleLinkedList.forwardTraverse();
//        doubleLinkedList.backwardTraverse();

        System.out.println(doubleLinkedList.isPalindrome());
    }
}
