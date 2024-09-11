package com.example;

public class LinkedList {



    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
