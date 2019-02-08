package object_oriented;

/**
 * Created by mahdihs76 on 2/7/19.
 */
public class Dog extends Animal {
    public final static int MAX_DOG_NUMBER = 20;
    public static String variable = "static";
    private String name;
    private String skinColor;
    private int energy;

    {
        this.energy = 100;
    }

    public Dog(String name, String skinColor){
        this.name = name;
        this.skinColor = skinColor;
    }

    public void walk(){
        this.energy -= 20;
        System.out.println("Walk...");
    }
    public void feed(int energy){
        this.energy += energy;
    }

    public static void printDogPolicies(){
        System.out.println("1.2.3....");
    }

    public int getEnergy(){
        return this.energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getSkinColor() {
        return skinColor;
    }
}
