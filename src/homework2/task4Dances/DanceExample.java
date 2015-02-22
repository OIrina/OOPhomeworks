package homework2.task4Dances;

/**
 * Created by ira on 22.02.15.
 */
public class DanceExample {
    public static void main(String[] args) {

        ChaChaCha chachacha = new ChaChaCha("Cha Cha Cha", "Latina", 2);
        System.out.println("Dance " + chachacha.name + " is " + chachacha.kind + " with " + chachacha.numberOfDancers + " dancers.");
        System.out.println(chachacha.name + " has a rhythm: " + chachacha.rhythm());

        System.out.println("________________________________________________");

        Jive jive = new Jive("Jive", "Latina", 2);
        System.out.println("Dance " + jive.name + " is " + jive.kind + " with " + jive.numberOfDancers + " dancers.");
        System.out.println(jive.name + " has a rhythm: " + jive.rhythm());

        System.out.println("________________________________________________");

        Waltz waltz = new Waltz("Waltz", "Standard", 2);
        System.out.println("Dance " + waltz.name + " is " + waltz.kind + " with " + waltz.numberOfDancers + " dancers.");
        System.out.println(waltz.name + " has a rhythm: " + waltz.rhythm());
    }
}
