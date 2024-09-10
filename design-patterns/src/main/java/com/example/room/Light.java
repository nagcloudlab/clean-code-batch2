package com.example.room;

public class Light implements DoorListener {

    public void on(DoorEvent event) {
        System.out.println("Light is on--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }

    public void off(DoorEvent event) {
        System.out.println("Light is off--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }
}
