public class Shape {
    double x;

    // Constructors
    public Shape() {
        this.x = 0;
    }

    public Shape(double x) {
        this.x = x;
    }

    // Setter and Getter
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    // Area method returning -9.99 as per instruction
    public double getArea() {
        return -9.99;
    }
}