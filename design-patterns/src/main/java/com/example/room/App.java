package com.example.room;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*
    pattern: Observer / Listener
 */


public class App {
    public static void main(String[] args) throws InterruptedException {

        Door door = new Door();

        Light light = new Light();
        AC ac = new AC();
        Computer computer = new Computer();

        door.addDoorListener(light);
        door.addDoorListener(ac);
        door.addDoorListener(computer);

        TimeUnit.SECONDS.sleep(2);
        door.open();
        TimeUnit.SECONDS.sleep(2);
        door.close();

        door.removeDoorListener(ac);

        TimeUnit.SECONDS.sleep(2);
        door.open();
        TimeUnit.SECONDS.sleep(2);
        door.close();


    }
}
