package homework2.task1Cars;

/**
 * Created by ira on 18.02.15.
 */
public class Car {
    protected String name;
    protected Engine engine;
    private Climate climate = new Climate();
    private double fuelRate;

    public Car(String name) {
        this(name, 0, 0);
    }

    public Car(String name, double mileage, double engineCapacity) {
        this.name = name;
        engine = new Engine(mileage, engineCapacity);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {
            double distance = hours * speed;
            engine.addMileage(distance);
            double f = (distance / 100) * engine.getFactor();
            fuelRate += f;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", climate=" + climate +
                '}';
    }
}
