package com.example;

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
