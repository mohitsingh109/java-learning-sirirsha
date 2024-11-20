package com.javalearning.datastructure.doublelinkedlist;

public class DoubleLinkedList {

    DLLNode head;

    DLLNode tail;

    //Insert in front
    // O(1)
    public void insertAtFront(int data) {
        DLLNode node = new DLLNode(data);
        if(head == null) { // we are inserting the node for the first time
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node; // reverse linking
            head = node;
        }
    }

    //Insert in end
    // O(1)
    public void insertAtEnd(int data) {
        DLLNode node = new DLLNode(data);

        if(head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    //iterate forward
    // O(N)
    public void forwardTraverse() {
        DLLNode current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }

    //iterate backward
    // O(N)
    public void backwardTraverse() {
        DLLNode current = tail;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.prev;
        }

        System.out.println("NULL");
    }

    //delete in front
    //O(1)
    public void deleteFrontNode() {
        if (head == null) // No Node
            return;

        if(head == tail) { // 1 Node
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    //delete in end
    public void deleteEndNode() {
        if(head == null)
            return;

        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // delete by node
    public void deleteNode(DLLNode node) {
        DLLNode prev = node.prev;
        DLLNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    // find a value in linked list
    public boolean searchByValue(int value) {
        if(head == null)
            return false;

        DLLNode current = head;
        while (current != null) {
            if(current.data == value)
                return true;

            current = current.next;
        }

        return false;
    }

    //delete by value

    public void deleteByValue(int value) {
        if(head == null) // No data
            return;

        DLLNode current = head;

        if(head.data == value) { // delete in the front
            deleteFrontNode();
            return;
        }

        if(tail.data == value) { // delete in the end
            deleteEndNode();
            return;
        }

        while (current != null) {
            if(current.data == value) {
                break;
            }
            current = current.next;
        }

        // current pointer is pointing to some node or null
        if(current != null) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }


    public boolean isPalindrome() {
        DLLNode front = head;
        DLLNode back = tail;

        while (front != back && front.prev != back) {
            if(front.data != back.data) {
                return false;
            }

            front = front.next;
            back = back.prev;
        }

        return true;
    }

}
