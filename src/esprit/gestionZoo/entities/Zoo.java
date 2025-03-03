package esprit.gestionZoo.entities;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    private int nbCages;
    private String city;
    private String name;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;


    public Zoo() {
    }


    public int getNbCages() {
        return nbCages;
    }

    public void setNbCages(int nbCages) {
        this.nbCages = nbCages;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Zoo(String city, String name) {
        this.nbCages = 25;
        this.city = city;
        this.name = name;
        this.animals = new Animal[nbCages];
        this.aquaticAnimals = new Aquatic[10];

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nbCages=" + nbCages +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", 7ayawenet=" + Arrays.toString(animals) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return getNbCages() == zoo.getNbCages() && Objects.equals(getCity(), zoo.getCity()) && Objects.equals(getName(), zoo.getName());
    }

    public boolean addAnimal(Animal animal) {
        if (!this.isFull()) {
            int compteur = 0;
            int search = this.searchAnimal(animal);
            if (search == -1) {
                for (Animal a : animals) {
                    if (a == null) {
                        animals[compteur] = animal;
                        return true;
                    }
                    compteur++;
                }
            }
        }
        return false;
    }

    public void showAnimals() {
        System.out.println(Arrays.toString(this.animals));
    }

    public int searchAnimal(Animal animal) {
        int compteur = 0;
        for (Animal i : animals) {
            if (i != null) {
                if (i.getName().equals(animal.getName())) {
                    return compteur;
                }
                compteur++;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            this.animals[index] = null;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        int compteur = 0;
        for (Animal i : animals) {
            if (i != null) {
                compteur++;
            }
        }
        if (compteur == this.nbCages) {
            return true;
        } else return false;
    }

    public int nbAnimals() {
        int compteur = 0;
        for (Animal i : animals) {
            if (i != null) {
                compteur++;
            }
        }
        return compteur;
    }

    public Zoo compare(Zoo zoo1) {
        int nbz1 = this.nbAnimals();
        int nbz2 = zoo1.nbAnimals();
        if (nbz1 > nbz2) {
            return this;
        } else return zoo1;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (!this.isFullAquatic()) {
            int compteur = 0;
            int search = this.searchAnimalAquatic(aquatic);
            if (search == -1) {
                for (Aquatic a : aquaticAnimals) {
                    if (a == null) {
                        aquaticAnimals[compteur] = aquatic;

                    }
                    compteur++;
                }
            }
        }


    }

    public boolean isFullAquatic() {
        int compteur = 0;
        for (Aquatic i : aquaticAnimals) {
            if (i != null) {
                compteur++;
            }
        }
        return compteur == 10;
    }

    public int searchAnimalAquatic(Animal animal) {
        int compteur = 0;
        for (Aquatic i : aquaticAnimals) {
            if (i != null) {
                if (i.getName().equals(animal.getName())) {
                    return compteur;
                }
                compteur++;
            }
        }
        return -1;
    }

    public float maxPenguinSwimmingDepth() {
        float max = 0;
        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Penguin) {
                if (((Penguin) a).getSwimming_depth() > max) {
                    max = ((Penguin) a).getSwimming_depth();
                }
            }
        }
        return max;
    }

public void displayNumberOfAquaticsByType(){
        int nbDauphins = 0,nbPinguins =0;
        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Penguin) {
                nbPinguins++;
            }
            if (a instanceof Dauphin) {
                nbDauphins++;
            }
        }
    System.out.println("le nombre de pinguins est : " + nbPinguins);
    System.out.println("le nombre de dauphins est : " + nbDauphins);
}



}
