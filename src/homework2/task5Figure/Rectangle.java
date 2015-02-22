package homework2.task5Figure;

/**
 * Created by ira on 22.02.15.
 */
public class Rectangle extends Figure {
    double horizontal;
    double vertical;

    public Rectangle(double horizontal, double vertical) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    @Override
    public double getSquare() {
        return horizontal * vertical;
    }
}
