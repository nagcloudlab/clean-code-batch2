package com.example.car;


/*
pattern: Decorator
 */

interface Car{
    void assemble();
}

// SRP - Single Responsibility Principle
class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}

// Decorator
abstract class CarDecorator implements Car{
    protected Car car;
    public CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}

// SRP - Single Responsibility Principle
class CarWithAirConditioner extends CarDecorator{
    public CarWithAirConditioner(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding Air Conditioner.");
    }
}

// SRP - Single Responsibility Principle
class CarWithStereo extends CarDecorator{
    public CarWithStereo(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding Stereo.");
    }
}

public class App {
    public static void main(String[] args) {

        Car basicCar = new BasicCar();
        //basicCar.assemble();

        CarWithStereo carWithStereo = new CarWithStereo(basicCar);
        //carWithStereo.assemble();

        CarWithAirConditioner carWithAirConditioner = new CarWithAirConditioner(carWithStereo);
        carWithAirConditioner.assemble();

    }
}
