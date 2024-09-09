package com.example.room;

import java.util.ArrayList;
import java.util.List;

// Single Responsibility Principle
// Open-Closed Principle
// Liskov Substitution Principle
// Interface Segregation Principle

public class Door {

//    private Light light=new Light();
//    private AC ac=new AC();

    private List<DoorListener> doorListeners=new ArrayList<>();

    public void addDoorListener(DoorListener doorListener){
        doorListeners.add(doorListener);
    }

    public void removeDoorListener(DoorListener doorListener){
        doorListeners.remove(doorListener);
    }

    public void open() {
        System.out.println("Door is open");
//        light.on();
//        ac.on();
        for(DoorListener doorListener:doorListeners){
            doorListener.on(new DoorEvent(1,2));
        }
    }

    public void close() {
        System.out.println("Door is closed");
//        light.off();
//        ac.off();
        for(DoorListener doorListener:doorListeners){
            doorListener.off(new DoorEvent(1,2));
        }
    }
}
