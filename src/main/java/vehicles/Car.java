package vehicles;

public class Car extends Vehicle {
    public Car(String make, String model) {
        new CarEngine();
        super(make, model);
    }
}
