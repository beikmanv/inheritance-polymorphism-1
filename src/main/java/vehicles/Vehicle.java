package vehicles;

public abstract class Vehicle {

    String make;
    String model;
    int speed;
    Engine engine;

    public Vehicle(String make, String model) {
            this.make = make;
            this.model = model;
    }

    public void start() {
        this.engine.start();
    }
    public void drive() {
        if (engine.running){
            accelerate();
        }else {
            System.out.println(make + " " + model + " is not running.");
        }
    }
    abstract protected void accelerate();

}
