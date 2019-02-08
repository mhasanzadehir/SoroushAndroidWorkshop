package object_oriented;

/**
 * Created by mahdihs76 on 2/7/19.
 */
public class JungleTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "Black");
        Dog dog2 = new Dog("Joe", "Gold");

        dog1.walk();
        dog1.walk();
        dog1.walk();
        dog1.feed(200);
        dog1.walk();
        dog1.setSkinColor("Red");
        System.out.println(dog1.getEnergy());
        System.out.println(dog1.getSkinColor());

        Dog.variable = "static2";
        Dog.printDogPolicies();

    }
}
