package com.example.room;

public class DoorEvent {
    private int doorNumber;
    private int floorNumber;

    public DoorEvent(int doorNumber, int floorNumber) {
        this.doorNumber = doorNumber;
        this.floorNumber = floorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
