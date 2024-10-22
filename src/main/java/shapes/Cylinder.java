package shapes;

public class Cylinder extends Shape3D{

    double height;


    public double calculateVolume(Circle base, double height) {
        double result = base.radius * height;
        System.out.println("Cylinder volume: " + result);
        return result;
    }

    public Cylinder(double height, Circle base) {
        this.height = height;
    }
}
