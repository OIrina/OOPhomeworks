package homework2.task1Cars;

/**
 * Created by ira on 18.02.15.
 */
public class Engine {
    protected double mileage;
    private double engineCapacity;
    protected boolean started;

    public Engine(double mileage, double engineCapacity) {
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
    }

    public double getFactor(){
        double factor;

        if (engineCapacity == 2.0) {
            factor =  10;

        } else if (engineCapacity == 3.0) {
            factor =  15;

        } else if (engineCapacity == 4.2) {
            factor =  18;

        } else {
            factor =  0;
        } return factor;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mileage=" + mileage +
                ", engineCapacity=" + engineCapacity +
                ", started=" + started +
                '}';
    }
}
