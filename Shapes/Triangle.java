public class Triangle extends Shape {
    private double y; 

    
    public Triangle() {
        super();
        this.y = 0;
    }

    public Triangle(double x, double y) {
        super(x); 
        this.y = y;
    }

    
    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    
    public double getArea() {
        return 0.5 * getX() * y;
    }

    public void showInfo() {
        System.out.println("--- Triangle Details ---");
        System.out.println("Base (x): " + getX());
        System.out.println("Height (y): " + getY());
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}