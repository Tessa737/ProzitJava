package esprit.gestionZoo.entities;

public class Serpent extends Terestrial {
    private int length ;

    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public Serpent(String family, String name, int age, boolean isMamal, int nbLegs, int length) {
        super(family, name, age, isMamal, nbLegs);
        this.length = length;
    }

    public Serpent() {
    }
  @Override
  public String toString(){
   return super.toString()+"Serpent [length=" + length + "]";
  }

}

