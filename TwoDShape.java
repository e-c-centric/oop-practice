public abstract class TwoDShape extends Shape {
    public abstract double calculatePerimeter();

    @Override
    public String describe() {
        return getShape() + " - area: " + calculateArea()
                + ", perimeter: " + calculatePerimeter();
    }
}