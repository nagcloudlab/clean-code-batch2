package com.example;

abstract class Employee {
    public abstract double payAmount();
}

class Engineer extends Employee {
    public double payAmount() {
        return 1000.0 * 0.2;
    }
}

class SalesMan extends Employee {
    public double payAmount() {
        return 1000.0 * 0.1;
    }
}


public class App1 {
    public static void main(String[] args) {

        Employee engineer = new Engineer();
        Employee salesMan = new SalesMan();

        System.out.println(
                "Engineer pay amount: " + calculatePayAmount(engineer) + "\n"
        );
        System.out.println(
                "SalesMan pay amount: " + calculatePayAmount(salesMan) + "\n"
        );

    }

    // polymorphism => OCP (Open-Closed Principle)
    private static double calculatePayAmount(Employee employee) {
        return employee.payAmount();
    }


}
