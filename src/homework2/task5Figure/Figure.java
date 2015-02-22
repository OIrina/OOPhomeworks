package homework2.task5Figure;

/**
 * Created by ira on 22.02.15.
 */
public abstract class Figure {
    protected String name;
    protected double square;

    public Figure() {
    }

    public String getName() {
        return name;
    }

    public abstract double getSquare();
}
