package homework2.task5Figure;

/**
 * Created by ira on 22.02.15.
 */
public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
