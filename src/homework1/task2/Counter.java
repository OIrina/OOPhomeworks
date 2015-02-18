package homework1.task2;

/**
 * Created by ira on 16.02.15.
 */
public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
