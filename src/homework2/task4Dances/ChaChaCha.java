package homework2.task4Dances;

/**
 * Created by ira on 22.02.15.
 */
public class ChaChaCha extends Dance {


    public ChaChaCha(String name, String kind, int numberOfDancers) {
        super(name, kind, numberOfDancers);
    }

    @Override
    public String rhythm() {
        return "Cha-cha-one-two-three-cha-cha-one!!!";
    }
}
