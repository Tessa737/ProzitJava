package esprit.gestionZoo.entities;

public class Terestrial extends Animal{
    protected int nbLegs;

    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public Terestrial(String family, String name, int age, boolean isMamal, int nbLegs) {
        super(family, name, age, isMamal);
        this.nbLegs = nbLegs;
    }

    public Terestrial() {
    }

     @Override
    public String toString() {
        return "Terestrial{" +
                "nbLegs=" + nbLegs +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMamal=" + isMamal +
                '}';
    }
}
