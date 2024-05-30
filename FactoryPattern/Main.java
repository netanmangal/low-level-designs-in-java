package FactoryPattern;

import FactoryPattern.Animals.AnimalDetails;

public class Main {

    public static void main(String args[]) {
        AnimalFactory animalFactory = new AnimalFactory();

        for (int i = 0; i < 200; i++) {
            AnimalDetails animalDetails = animalFactory.getRandomAnimal();
            System.out.println(STR."Animal selected is : \{animalDetails.getType()} : \{animalDetails.getDetails()}");
        }
    }

}
