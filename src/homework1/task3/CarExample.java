package homework1.task3;

/**
 * Created by ira on 17.02.15.
 */
public class CarExample {
    public static void main(String[] args) {

        Auto car1 = new Auto("Peugeot", "blue", 70);

        System.out.println("Car1 is: " + car1.colour + car1.name);

        car1.startEngine(0);

        car1.movingAuto(70);

        car1.setSpeedLevel(70);

        car1.stopEngine();
    }
}
