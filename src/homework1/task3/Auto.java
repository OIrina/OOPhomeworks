package homework1.task3;

/**
 * Created by ira on 16.02.15.
 */
public class Auto {

    public String name;
    public String colour;
    public double speed;

    public Auto(String name, String colour, double speed) {
        this.name = name;
        this.colour = colour;
        this.speed = speed;
    }

    public Auto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void startEngine(double speed){
        speed++;
        System.out.println("Engine is started");
    }

    public void stopEngine(){
        speed = 0;
        System.out.println("Engine is stopped");
    }

    public void movingAuto(double speed){
        if (speed > 0)
            System.out.println("Car is moving");
        else
            System.out.println("Car is stopped");
    }

    public void setSpeedLevel(double speed){
        System.out.println("Speed is: " + speed + " km/h");
    }
}
