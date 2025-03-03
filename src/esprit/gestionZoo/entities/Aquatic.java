package esprit.gestionZoo.entities;

import java.util.Objects;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMamal, String habitat) {
        super(family, name, age, isMamal);
        this.habitat = habitat;
    }

    public Aquatic() {

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMamal=" + isMamal +
                '}';
    }
    public void swim() {
        System.out.println("ena tawa fi aquatic");
    }
    public void eat() {
        System.out.println("7outa tekil");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(getHabitat(), aquatic.getHabitat()) && super.getName().equals(aquatic.getName()) && super.getAge() == aquatic.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getHabitat());
    }
}
