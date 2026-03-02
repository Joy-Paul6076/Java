public class ShapesStart {
    public static void main(String[] args) {
       
        Square s1 = new Square();
        s1.setX(4.0);
        
        Square s2 = new Square(8.0);

       
        Triangle t1 = new Triangle();
        t1.setX(10.0);
        t1.setY(5.0);

        Triangle t2 = new Triangle(6.0, 7.0);

       
        s1.showInfo();
        s2.showInfo();
        t1.showInfo();
        t2.showInfo();
    }
}
