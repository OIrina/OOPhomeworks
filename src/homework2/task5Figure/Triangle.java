package homework2.task5Figure;

/**
 * Created by ira on 22.02.15.
 */
public class Triangle extends Figure {
    double vertical;
    double horizontal;

    public Triangle(double horizontal, double vertical) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public double getSquare() {
        return (vertical * horizontal) / 2;
    }
}
