package esprit.gestionZoo.entities;

public class Dauphin extends Aquatic{
    private float swimming_speed;

    public float getSwimming_speed() {
        return swimming_speed;
    }

    public void setSwimming_speed(float swimming_speed) {
        this.swimming_speed = swimming_speed;
    }

    public Dauphin(String family, String name, int age, boolean isMamal, String habitat, float swimming_speed) {
        super(family, name, age, isMamal, habitat);
        this.swimming_speed = swimming_speed;
    }

    public Dauphin() {

    }

    @Override
    public String toString() {
        return "Dauphin{" +
                "swimming_speed=" + swimming_speed +
                ", habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMamal=" + isMamal +
                '}';
    }
    public void swim() {
        System.out.println("ena tawa fi dauphin");
    }
}
