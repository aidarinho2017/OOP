import java.util.Vector;
public class TestShape {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<Shape>();

        Circle circle = new Circle(1, Colors.Red, 10);
        Circle circle1 = new Circle(4, Colors.Red, 10);
        Circle circle2 = new Circle(3, Colors.Black, 10);
        Triangle tr1 = new Triangle(5, Colors.Red, 25, 2);
        Triangle tr2 = new Triangle(5, Colors.Black, 25, 2);
        Triangle tr3 = new Triangle(5, Colors.Red, 25, 2);
        Rectangle r1 = new Rectangle(12, Colors.Red, 30, 23);
        Rectangle r2 = new Rectangle(6, Colors.Black, 30, 23);
        Rectangle r3 = new Rectangle(6, Colors.Red, 33, 27);

        shapes.add(circle);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(tr1);
        shapes.add(tr2);
        shapes.add(tr3);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(r3);

        for (Shape shape : shapes) {
            shape.draw();
            shape.showInfo();
        }
    }


}
