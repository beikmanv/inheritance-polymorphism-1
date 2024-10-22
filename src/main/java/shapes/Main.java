package shapes;


import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(2, 5),
                new Triangle(3, 7)
        );

        double x = 2;
        double y = 3;
        double z = 4;


        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area = " + shape.calculateArea(x,y));
        }

    }
}
