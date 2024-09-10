package com.example.room;

public class Computer implements DoorListener{
    @Override
    public void on(DoorEvent event) {
        System.out.println("Computer is on--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }

    @Override
    public void off(DoorEvent event) {
        System.out.println("Computer is off--->"+event.getFloorNumber()+"--->"+event.getDoorNumber());
    }
}
