package lab4.shape;

public class Main {
    public static void main(String[] args){
        System.out.println("Circle: ");
        Circle circle = new Circle("blue", FillType.FILLED, 5);
        circle.displayInfo();
        double circumfarence = circle.calculateCircumference(circle.radius);
        System.out.println("Circumfarence: " + circumfarence);

        System.out.println("\nRectangle: ");
        Rectangle rectangle = new Rectangle("red", FillType.NOT_FILLED, 5,3);
        rectangle.displayInfo();

    }
}
