package com.javalearning.datastructure.linkedlist;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10]; // 8 bytes => 80 bytes
//        LinkedList linkedList = new LinkedList(); // 160 bytes (1 Node: 8 bytes + 8 bytes)
//        linkedList.add(20);
//        linkedList.add(20);
//        linkedList.add(20);
//        linkedList.add(10);
//        linkedList.add(20);
//        linkedList.add(30);
//        linkedList.add(20);
//        linkedList.add(300);
//        linkedList.add(20);
//
//        linkedList.display();

//        System.out.println(linkedList.findByIndex(800));
        //linkedList.deleteAllNodeWithO_N(20);

        //linkedList.display();

//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.deleteFirst();
//        linkedList.display();
//        System.out.println("calling display again");
//        linkedList.display();
//        System.out.println("-------");

//        System.out.println(linkedList.find(21));
//
//        LinkedList reverse = new LinkedList();
//        reverse.add(1);
//        reverse.add(2);
//        reverse.add(3);
//        reverse.add(4);
//        reverse.display();
//        // 1 --> 2 --> 3 --> 4
//        reverse.reverseList();
//        // 4 --> 3 --> 2 --> 1
//        reverse.display();

        LinkedList n1 = new LinkedList();
        n1.add(1);
        n1.add(10);
        n1.add(19);
        n1.add(20);

        LinkedList n2 = new LinkedList();
        n2.add(5);
        n2.add(8);
        n2.add(18);
        n2.add(25);
        n2.add(50);
        n2.add(60);

        Node headOfMergedList = LinkedList.mergeTwoList(n1.head, n2.head);
        Node current = headOfMergedList;
        while (current != null) {
            System.out.print(current.data + " --> "); //current.getData()
            current = current.next; // i++
        }
        System.out.println("NULL");



    }
}
