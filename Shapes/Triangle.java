// Triangle shape: uses `x` as base and `y` as height.
// Area = 0.5 * base * height.
public class Triangle extends Shape {
    private double y;

    // Default constructor: base and height start at 0
    public Triangle() {
        super();
        this.y = 0;
    }

    // Construct a Triangle with given base (x) and height (y)
    public Triangle(double x, double y) {
        super(x);
        this.y = y;
    }

    // Setter and getter for height `y`
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    // Calculate triangle area using base (x) and height (y)
    public double getArea() {
        return 0.5 * getX() * y;
    }

    // Print details about this triangle to the console
    public void showInfo() {
        System.out.println("--- Triangle Details ---");
        System.out.println("Base (x): " + getX());
        System.out.println("Height (y): " + getY());
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}