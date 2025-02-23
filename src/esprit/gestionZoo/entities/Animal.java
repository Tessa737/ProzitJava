package esprit.gestionZoo.entities;

import java.util.Objects;

public class Animal {

    protected String family;
    protected String name;
    protected int age;
    protected boolean isMamal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public boolean isMamal() {
        return isMamal;
    }

    public void setMamal(boolean mamal) {
        isMamal = mamal;
    }

    public Animal(String family, String name, int age, boolean isMamal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMamal = isMamal;
    }
    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMamal=" + isMamal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isMamal == animal.isMamal && Objects.equals(family, animal.family) && Objects.equals(name, animal.name);
    }

}
