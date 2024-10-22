package shapes;

public class Circle extends Shape {
    public Circle(int radius) {
        this.radius = radius;
    }

    public double radius;

    @Override
    public double calculateArea(double x, double y){
        //Circle: πr2(π x (radius x radius))
        return 3.14 * x * y;

    }
}
