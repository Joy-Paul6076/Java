// Creates instances, sets dimensions, and prints info.
public class ShapesStart {
    public static void main(String[] args) {

        // Square with default constructor
        Square s1 = new Square();
        s1.setX(4.0);

        // Square constructed with side 
        Square s2 = new Square(8.0);

        // Triangle using setters for base and height
        Triangle t1 = new Triangle();
        t1.setX(10.0);
        t1.setY(5.0);
        // Triangle constructed with base
        Triangle t2 = new Triangle(6.0, 7.0);

        // Show details for all shapes
        s1.showInfo();
        s2.showInfo();
        t1.showInfo();
        t2.showInfo();
    }
}
