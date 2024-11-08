package com.javalearning.datastructure.linkedlist;

public class LinkedList {

    // used to add/delete in the beginning
    // used to loop over the linked list
    // search
    Node head; // head of the linked list

    //add/delete in the end
    Node tail; // tail of the linked list

    //O(1)
    public void add(int data) {
        Node node = new Node(data);
        // if this add is called for the first time
        if(head == null || tail == null) {
           addFirst(data);
        } else {
            tail.next = node; // linking // tail.setNext(node)
            tail = node; // update the tail
        }
    }

    // O(1)
    public void addFirst(int data) {
        // first time call head or tail both are null
        // else
        Node node = new Node(data);

        if(head == null || tail == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //O(1)
    public void deleteFirst() {
        //if linked list is empty??
        if(head != null) { // list is not empty
            if(head == tail) { // single node is present
                tail = null;
                head = null;
            } else { // more then 1 node
                head = head.next; // null.next
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data); //current.getData()
            current = current.next; // i++
        }
    }
}
