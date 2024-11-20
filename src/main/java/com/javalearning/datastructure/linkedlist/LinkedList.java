package com.javalearning.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    // used to add/delete in the beginning
    // used to loop over the linked list
    // search
    Node head; // head of the linked list

    //add/delete in the end
    Node tail; // tail of the linked list

    //O(1)
    //addLast()
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
        if(head != null) { // no node
            if(head == tail) { // single node
                tail = null;
            }
            head = head.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> "); //current.getData()
            current = current.next; // i++
        }
        System.out.println("NULL");
    }

    public boolean find(int value) { // 20
        // Time Complexity: O(N) // N = number of nodes
        Node current = head;

        while (current != null) {
            if(current.data == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public Node findByIndex(int index) {
        if(head == null)
            return null;

        if(index < 0) {
            throw new IllegalStateException("Invalid Index value should be >= 0");
        }

        if(index == 0) {
            return  head;
        }

        Node current = head;
        while (index > 0 && current != null) {
            index--; // 0
            current = current.next;
        }

        if(index != 0) {
            throw new IllegalStateException("Index out of bond exception");
        }

        return current;

    }

    public void delete(int value) { // 200

        // O(N)

        // null
        if(head == null)
            return;

        // deleting a head node
        if(head.data == value) { // deleteFirst()
            deleteFirst();
            return;
        }

        Node current = head;                  // 20 != 20
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if(current.next != null) {
            if(current.next == tail) { //delete last node
                tail = current;
            }
             current.next = current.next.next; // 30 node
        }
    }


    // 40 --> 33 --> 20 ---> 20 ---> 50 ---> 66 --> 20
    // 40 --> 33 ---> 20 ---> 50 ---> 66 --> 20
    // 40 --> 33 ---> 50 ---> 66 --> 20
    // 40 --> 33 ---> 50 ---> 66

    // Example (N X N)
    // 12 --> 563 --> 234--> ... 50M ... 20 --> 20 --> 100M

    // Example O(N)
    // 20 --> 20 ---> 20 --> 20
    public void deleteAllNode(int value) { //20
        boolean found = false;
        do {
            found = find(value); // O(N) O(1)
            if(found) {
                delete(value);   // O(N) O(1)
            }
        } while (found != false); // O(N)

        //Time Complexity: (N X N)
    }

    public void deleteAllNodeWithO_N(int value) { //20
        Node dummy = new Node(0);
        dummy.next = head;

        Node previous = dummy; // to handle scenario of delete first node
        Node current = head;

        while (current != null) { // O(N)

            if(current.data == value) { // I found the node to be delete
                // delete
                previous.next = current.next;

                if(current == tail) {
                    tail = previous;
                }

            } else { // current node is not the node to be deleted
                previous = current;
            }

            current = current.next;
        }
        head = dummy.next;
    }


    // Reverse Linked List
    // 1 --> 2 ---> 3 --> 4 ---> Null
    // 4 --> 3 ---> 2 --> 1 ---> Null

    public void reverseListWithArray() {
        List<Integer> values = new ArrayList<>(); // 1, 2, 3, 4

        Node current = head;

        while (current != null) { // O(N)
            values.add(current.data);
            current = current.next;
        }

        current = head; //

        for(int i = values.size() - 1; i>=0; i--) { // i = 2 // O(N)
            current.data = values.get(i);
            current = current.next;
        }

       //Time Complexity: O(N)
        //Space Complexity: O(N)
    }

    public void reverseListWithArrayAsNode() {

        if(head == null) {
            return;
        }

        List<Node> nodes = new ArrayList<>(); // O(N)

        Node current = head;

        while (current != null) { // O(N)
            nodes.add(current);
            current = current.next;
        }

        for(int i = nodes.size() - 1; i > 0 ; i--) { // i = 0  // O(N)
            Node curr = nodes.get(i);
            Node prev = nodes.get(i - 1);
            curr.next = prev;
        }

        head.next = null;
        head = nodes.getLast();
        tail = nodes.getFirst();

        //Time: O(N)
        //Space: O(N) --> O(1)
    }

    public void reverseList() {

        if(head == null) {
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            //code to reverse the linking
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        tail = head;
        head = prev;

        // Time: O(N)
        // Space: O(1)
    }

    //Merge Two Sorted Lists

    public static Node mergeTwoList(Node n1, Node n2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (n1 != null && n2 != null) {

            if(n1.data < n2.data) { // n1 has small in value
                current.next = n1;
                n1 = n1.next;
            } else {
                // n2
                current.next = n2;
                n2 = n2.next;
            }

            current = current.next;
        }

        //n1 has some node left
        if(n1 != null) {
            current.next = n1;
        }

        // n2 has some node left
        if(n2 != null) {
            current.next = n2;
        }

        return dummy.next;
    }



    public static boolean hasCycle(Node head) {

        List<Node> nodes = new ArrayList<>();
        Node current = head;

        while (current != null) { // O(N)
            if(nodes.contains(current)) { // O(N)
                return true;
            }

            nodes.add(current);
            current = current.next;
        }

        return false;

        // Time Complexity: O(N * N)
        // Space: O(N)
    }

    public static boolean hasCycleSet(Node head) {

        Set<Node> nodes = new HashSet<>();
        Node current = head;

        while (current != null) { // O(N)
            if(nodes.contains(current)) { // O(1)
                return true;
            }

            nodes.add(current);
            current = current.next;
        }

        return false;

        // Time Complexity: O(N)
        // Space: O(N) ===> O(1)
    }

    public static boolean hasCycleO_1_Space(Node head) {

        Node slow = head; // 1 step
        Node fast = head; // 2 step

        while (fast != null && fast.next != null) {
            slow = slow.next; // 1
            fast = fast.next.next; // 2
            if(fast == slow) return true;
        }

        // Time Complexity: O(N)
        // Space: O(1)

        return false;
    }

    // Delete Node in a linked List

    public static void deleteNode(Node node) { // it will never be tail
        node.data = node.next.data;
        node.next = node.next.next;
    }


    public static Node getIntersectionNode(Node head1, Node head2) {
        Set<Node> hashSet = new HashSet<>(); // look up to find the intersection node

        Node current = head1;

        // Building a hash set
        while (current != null) {
            hashSet.add(current);
            current = current.next;
        }

        current = head2;

        while (current != null) {
            if(hashSet.contains(current)) {
                break;
            }
            current = current.next;
        }

        return current;

        // Time: O(N)
        // Space: O(N) ===> O(1)
    }

    public static Node getIntersectionNodeWithO_1Space(Node head1, Node head2) {
        Node a = head1;
        Node b = head2;

        while (a != b) {
            a = (a == null)? null: a.next;
            b = (b == null)? null: b.next;
        }

        return a; // Either Node

        // Time: O(N)
        // Space: O(1)
    }

}
