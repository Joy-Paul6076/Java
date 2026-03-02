public class Square extends Shape {
    
  
    public Square() {
        super();
    }
    
    public Square(double x) {
        super(x); 
    }
    
    
    public double getArea() {
        return getX() * getX();
    }
    
    public void showInfo() {
        System.out.println("--- Square Details ---");
        System.out.println("Side (x): " + getX());
        System.out.println("Area: " + getArea());
        System.out.println();
    }
}