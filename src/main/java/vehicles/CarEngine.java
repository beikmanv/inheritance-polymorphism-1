package vehicles;

public class CarEngine {

    boolean running;
    int horsepower;
    String fuelType;


    public CarEngine(int horsepower, String fuelType, boolean running) {
        this.running = running;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        new CarEngine();

    }


    public CarEngine() {

    }
}
