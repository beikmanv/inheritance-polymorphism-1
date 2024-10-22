package shapes;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circleOne = new Circle(5);

        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7),
                new Cylinder(5, (Shape) circleOne)
        );

        double x = 2;
        double y = 3;
        double z = 4;


        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea(x,y));
        }

    }
}
