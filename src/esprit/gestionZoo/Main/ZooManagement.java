package esprit.gestionZoo.Main;

import esprit.gestionZoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
//        Zoo myZoo = new Zoo("tunis","belvedere");
//        Animal lion =  new Animal();
//        lion.setAge(5);
//        lion.setName("Lion");
//        lion.setFamily("felin");
//        lion.setMamal(true);
//        Animal dog =  new Animal("felin","dog",5,true);
//        System.out.println(myZoo);
//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(dog);
//        myZoo.addAnimal(lion);
//        System.out.println(myZoo);
//        myZoo.showAnimals();
//        int exist = myZoo.searchAnimal(dog);
//        System.out.println(exist);
        Terestrial nimr = new Terestrial("nmoura","nimri",8,true,4);
        Penguin myPenguin = new Penguin("penguin","batri9",2,false,"pole nord",5);
        Dauphin myDauphin = new Dauphin("dauphin","7outa",3,false,"ocean",50);
        myDauphin.swim();
        myPenguin.swim();
        Serpent hnash = new Serpent("zawehef","hanshoun",70,true,0,10);
    }

}
