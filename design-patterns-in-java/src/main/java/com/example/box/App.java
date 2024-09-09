package com.example.box;

/*
    data-structure => a memory with data elements
    iterator => a object who can iterate over a data-structure
    data-structure + iterator => iterable
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(10); // dynamic array
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        display(arrayList);

        LinkedList<String> linkedList = new LinkedList<>(); // doubly linked list
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        display(linkedList);

        MyList<String> myList = new MyList<>(10); // custom list
        myList.add("hello");
        myList.add("world");
        myList.add("java");

        display(myList);

    }

    // OCP: open for extension, closed for modification
    private static void display(Iterable<String> list) {
//        Iterator<String> iterator= list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        // or
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println();
    }
}
