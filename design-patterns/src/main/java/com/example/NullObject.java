package com.example;


import java.util.Optional;

class Insurnce {
    String name;

    public Insurnce(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Car {
    String name;
    // Insurnce insurnce; // null
    Optional<Insurnce> insurnce = Optional.empty();

    public Car(String name) {
        this.name = name;
    }

    public Optional<Insurnce> getInsurnce() {
        return insurnce;
    }
}

class Person {
    String name;
    // Car car; // null
    Optional<Car> car = Optional.empty();

    public Person(String name) {
        this.name = name;
    }

    public Optional<Car> getCar() {
        return car;
    }
}

public class NullObject {
    public static void main(String[] args) {

        // person has car, car has insurance
        Person person = new Person("John");
        Car car = new Car("Toyota");
        Insurnce insurnce = new Insurnce("Geico");
        car.insurnce = Optional.of(insurnce);
        //person.car = Optional.of(car);

        // get insurance name
        String insuranceName = person.car.flatMap(Car::getInsurnce).map(Insurnce::getName).orElse("Unknown");
        System.out.println(insuranceName);

    }
}
