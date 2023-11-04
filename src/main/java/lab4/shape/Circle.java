package lab4.shape;

public class Circle extends Shape {
    protected double radius;
    //private static final double PI = 3.14159;

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
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        double PI=Math.PI;
        return calculateCircumference(PI,r);
    }
}
