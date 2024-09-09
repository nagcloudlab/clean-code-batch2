package com.example.box;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {

    private E[] data;
    private int size;

    public MyList(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public void add(E value) {
        data[size] = value;
        size++;
    }

    public E get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
       return new Iterator<E>() {
              private int index = 0;

              @Override
              public boolean hasNext() {
                return index < size;
              }
              @Override
              public E next() {
                return data[index++];
              }
       };
    }
}
