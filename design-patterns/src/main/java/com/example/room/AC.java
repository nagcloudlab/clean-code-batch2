package com.example.room;

public class AC implements DoorListener {

    public void on(DoorEvent event) {
        System.out.println("AC is on--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }

    public void off(DoorEvent event) {
        System.out.println("AC is off--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }

}
