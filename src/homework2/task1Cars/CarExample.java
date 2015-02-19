package homework2.task1Cars;

import homework2.task1Cars.Car;

/**
 * Created by ira on 18.02.15.
 */
public class CarExample {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 10000, 2.0);
        Car ferrari = new Car("Ferrari", 20000, 3.0);

        System.out.println(bmw);
        System.out.println(ferrari);

        bmw.turnOn();
        ferrari.turnOn();

        final int[] speeds = {20, 60, 100};

        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);

        bmw.turnOff();
        ferrari.turnOff();

        System.out.println(bmw.getName() + " mileage: " + bmw.getMileage() + " miles.");
        System.out.println(ferrari.getName() + " mileage: " + ferrari.getMileage() + " miles.");
        System.out.println(bmw.getName() + " fuel rate: " + bmw.getFuelRate() + " liters.");
        System.out.println(ferrari.getName() + " fuel rate: " + ferrari.getFuelRate() + " liters.");

    }
}
