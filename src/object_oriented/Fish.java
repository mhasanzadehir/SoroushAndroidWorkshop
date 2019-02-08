package object_oriented;

/**
 * Created by mahdihs76 on 2/7/19.
 */
public class Fish extends Animal {
    //States
    private String skinColor;
    private int energy;

    public Fish(String name, String skinColor) {
        super(name);
        this.skinColor = skinColor;
    }

    //Behaviors
    private void swim(){}
    private void feed(){}

}
