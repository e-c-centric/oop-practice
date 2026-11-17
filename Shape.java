public abstract class Shape {
    public abstract String getShape();

    public abstract double calculateArea();

    public String describe() {
        return getShape() + " - area: " + calculateArea();
    }
}