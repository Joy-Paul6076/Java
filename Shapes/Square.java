// Square shape: uses `x` as the side length.
// Area = side * side.
public class Square extends Shape {

    // Default constructor: calls Shape() which sets x = 0
    public Square() {
        super();
    }

    // Construct a Square with a given side length
    public Square(double x) {
        super(x);
    }

    // Calculate area for a square (x^2)
    public double getArea() {
        return getX() * getX();
    }

    // Print details about this square to the console
    public void showInfo() {
        System.out.println("--- Square Details ---");
        System.out.println("Side (x): " + getX());
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}