package homework2.task4Dances;

/**
 * Created by ira on 22.02.15.
 */
public abstract class Dance {
    protected String name;
    protected String kind;
    protected int numberOfDancers;

    public Dance(String name, String kind, int numberOfDancers) {
        this.name = name;
        this.kind = kind;
        this.numberOfDancers = numberOfDancers;
    }

    public abstract String rhythm();
}
