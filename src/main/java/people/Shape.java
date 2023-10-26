package people;

import java.util.ArrayList;
import java.util.List;

/*
Create a class Shape and two derived classes Circle and Rectangle. Each derived class
should inherit properties and methods from the base Shape class and have their own
unique characteristics.

Shape Class have properties:
color (String) - to store the color of the shape, and filled
(enum FillType) - to indicate whether the shape is filled with color or not. FillType should
be an enum with values FILLED and NOT_FILLED.

Add a constructor to initialize the properties.

Include a method called displayInfo() that prints the color of the shape and
whether the shape is filled or not, and a method called getArea().

Circle Class extends the Shape class and has property radius (double) - to store the
radius of the circle.

Add a constructor to initialize filltype, color, and radius properties.

Override the displayInfo() and getArea() methods to display the information specific to
the circle, including the radius, color, filltype and to calculate the area of a circle.

Add the function calculateCircumference(double PI, double r) to calculate circumference
(2πr) and one more same method calculateCircumference(double r) where the PI will
now be taken as a constant and not as a parameter.
You should also create a class called Rectangle that extends the Shape class as well
and the class has properties width (double) and height (double) - to store the width and
height of the rectangle. Add a constructor to initialize the filltype, color, width, and height
properties. Override the displayInfo() and getArea() methods to display the information
specific to the rectangle, including the width and height and its area.
In Main, create instances of the Circle and Rectangle classes and set their properties
and call the displayInfo() method to display the information about each shape and fill
types.
*/
enum FillType {
    FILLED, NOT_FILLED
}

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        //System.out.println("Circumference: " + calculateCircumference());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateCircumference(double r) {
        return 2 * PI * r;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);
        rectangle.displayInfo();

    }
}
