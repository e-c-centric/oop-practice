public abstract class Polygon extends TwoDShape {
    private int numberOfSides;

    protected Polygon(int numberOfSides) {
        if (numberOfSides < 3) {
            throw new IllegalArgumentException("A polygon needs at least 3 sides.");
        }
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        if (numberOfSides < 3) {
            throw new IllegalArgumentException("A polygon needs at least 3 sides.");
        }
        this.numberOfSides = numberOfSides;
    }
}