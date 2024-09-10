package com.example.shapes;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
 interface Shape {
    void draw(int x, int y, int radius);  // The extrinsic state is passed here
}

// Concrete Flyweight class
 class Circle implements Shape {
    private String color;  // Intrinsic state (shared)

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

class Rectangle implements Shape {
    private String color;  // Intrinsic state (shared)

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing a " + color + " rectangle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Flyweight factory
class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>(); // cache

    public static Shape getCircle(String color) {
        Shape circle = shapes.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapes.put(color, circle);
            System.out.println("Creating a " + color + " circle");
        }
        return circle;
    }

    public static Shape getRectangle(String color) {
        Shape rectangle = shapes.get(color);
        if (rectangle == null) {
            rectangle = new Rectangle(color);
            shapes.put(color, rectangle);
            System.out.println("Creating a " + color + " rectangle");
        }
        return rectangle;
    }

}



public class App {
    public static void main(String[] args) {

        // i want draw 10 circles, 1 red, 3 green, 6 blue

        // draw 1 red circle
        Shape redCircle = ShapeFactory.getCircle("red");
        redCircle.draw(100, 100, 10);

        // draw 3 green circles
        Shape greenCircle = ShapeFactory.getCircle("green");
        greenCircle.draw(200, 200, 20);
        greenCircle.draw(300, 300, 30);
        greenCircle.draw(400, 400, 40);

        // draw 6 blue circles
        Shape blueCircle = ShapeFactory.getCircle("blue");
        for (int i = 1; i <= 6; i++) {
            blueCircle.draw(i * 50, i * 50, i * 10);
        }

        // draw 1 red circle
        Shape redCircle2 = ShapeFactory.getCircle("red");
        redCircle2.draw(500, 500, 50);


        // draw 1000 rectangles with color red
        Shape redRectangle = ShapeFactory.getRectangle("red");
        for (int i = 1; i <= 1000; i++) {
            redRectangle.draw(i * 10, i * 10, i * 5);
        }

    }
}

// usecase: batch processing appln