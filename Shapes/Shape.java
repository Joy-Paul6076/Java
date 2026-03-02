// Base class for simple shapes. Holds a primary dimension `x`.
// Concrete shapes extend this class and override `getArea()`.
public class Shape {
    double x;

    // Default constructor: initialize x to 0
    public Shape() {
        this.x = 0;
    }

    // Parameterized constructor: set the primary dimension
    public Shape(double x) {
        this.x = x;
    }

    // Setter and Getter for the primary dimension `x`
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    // Placeholder area method. Subclasses should override with real calculations.
    public double getArea() {
        return -9.99;
    }
}