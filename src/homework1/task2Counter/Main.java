package homework1.task2Counter;

/**
 * Created by ira on 16.02.15.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Counter.count);

        int x = 10;
        while (x-- > 0)
            new Counter();

        System.out.println(Counter.count);
    }
}
