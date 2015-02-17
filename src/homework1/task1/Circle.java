package homework1.task1;

/**
 * Created by ira on 16.02.15.
 */
public class Circle extends Figure {

    private final String name = Circle.class.getSimpleName();

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double square() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
