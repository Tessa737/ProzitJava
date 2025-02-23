package esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    private float swimming_depth;

    public float getSwimming_depth() {
        return swimming_depth;
    }

    public void setSwimming_depth(float swimming_depth) {
        this.swimming_depth = swimming_depth;
    }

    public Penguin(String family, String name, int age, boolean isMamal, String habitat, float swimming_depth) {
        super(family, name, age, isMamal, habitat);
        this.swimming_depth = swimming_depth;
    }

    public Penguin() {
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "habitat='" + habitat + '\'' +
                ", swimming_depth=" + swimming_depth +
                ", isMamal=" + isMamal +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void swim() {
        System.out.println("Penguin swimming");
    }
    public void eat() {
        System.out.println("batri9 yekil");
    }
}
