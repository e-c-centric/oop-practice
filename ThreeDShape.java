public class ThreeDShape extends Shape {
    private double width;
    private double height;
    private double length;

    public ThreeDShape(double width, double height, double length) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than zero.");
        }
        this.length = length;
    }

    public double calculateVolume() {
        return width * height * length;
    }

    @Override
    public double calculateArea() {
        return 2 * (width * height + width * length + height * length);
    }

    @Override
    public String getShape() {
        return "3-D Rectangular Prism";
    }

    @Override
    public String describe() {
        return getShape() + " - surface area: " + calculateArea()
                + ", volume: " + calculateVolume();
    }
}