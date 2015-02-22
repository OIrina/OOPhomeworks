package homework2.task5Figure;

/**
 * Created by ira on 22.02.15.
 */
public class FigureExample {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 5);
        System.out.println("Triangle`s square is: " + triangle.getSquare() + "m2");

        Rectangle rectangle = new Rectangle(3, 3);
        System.out.println("Rectangle`s square is: " + rectangle.getSquare() + "m2");

        Circle circle = new Circle(7);
        System.out.println("Circle`s square is: " + circle.getSquare() + "m2");
    }
}
