package homework2.task4Dances;

/**
 * Created by ira on 22.02.15.
 */
public class Jive extends Dance {


    public Jive(String name, String kind, int numberOfDancers) {
        super(name, kind, numberOfDancers);
    }

    @Override
    public String rhythm() {
        return "One-two-three-four-three-four!!!";
    }
}
