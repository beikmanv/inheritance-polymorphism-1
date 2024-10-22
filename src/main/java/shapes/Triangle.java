package shapes;

public class Triangle extends Shape{
    public double base;
    public double height;

    @Override
    public double calculateArea(double base, double height){
        double area = (base * height) / 2;

        return area;


    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
}
