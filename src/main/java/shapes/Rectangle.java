package shapes;

public class Rectangle extends Shape{
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double length;
    public double width;

    double result = calculateArea(3, 4);

    @Override
    public double calculateArea(double a, double b){

        double area = a * b;

        return area;


    }


}
