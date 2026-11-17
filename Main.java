public class Main {
    public static void main(String[] args) {
        // Polymorphism: different subclasses are stored as Shape references.
        Shape[] shapes = {
            new Rectangle(4, 6),
            new ThreeDShape(4, 5, 6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }

        // Encapsulation: data is changed only through validated setters.
        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.setWidth(7);
        System.out.println("Updated rectangle area: " + rectangle.calculateArea());

        // Inheritance and downcasting: a Rectangle is also a Polygon and a TwoDShape.
        if (rectangle instanceof Polygon) {
            System.out.println("Rectangle sides: " + rectangle.getNumberOfSides());
        }
    }
}
