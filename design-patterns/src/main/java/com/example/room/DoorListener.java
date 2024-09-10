package com.example.room;

public interface DoorListener {
    void on(DoorEvent event);
    void off(DoorEvent event);
}
