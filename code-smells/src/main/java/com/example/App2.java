package com.example;

import java.util.Optional;

class Service{
    public void doSomething(){
        System.out.println("Service doSomething");
    }
}

class Insurance{
    String name;
    public Insurance(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

class Car{
    Optional<Insurance> insurance=Optional.empty();
    public Optional<Insurance> getInsurance(){
        return insurance;
    }
}

class Person{
    Optional<Car> car=Optional.empty();
    public Optional<Car> getCar(){
        return car;
    }
}

public class App2 {
    public static void main(String[] args) {

        Service service=null;
        if(service!=null)
        service.doSomething();

        // avoid null, istead of null, use NullObject pattern
        // in java, use Optional<T> class
        // in Scala, use Option[T] class
        // in Kotlin, use T? class
        // in C#, use Nullable<T> class
        // in javascript, use null or undefined
        // in python, use None



        Person person=new Person();
        Car car=new Car();
        Insurance insurance=new Insurance("My Insurance");
        car.insurance=Optional.of(insurance);
        person.car=Optional.of(car);

        String insuranceName=getPersonCarInsuranceName(person);
        System.out.println(insuranceName);

    }

    private static String getPersonCarInsuranceName(Person person) {
        return person.getCar()
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
