package FactoryPattern;

import FactoryPattern.Animals.AnimalDetails;
import FactoryPattern.Animals.Cat;
import FactoryPattern.Animals.Dog;
import FactoryPattern.Animals.Elephant;

import java.util.Random;

public class AnimalFactory {

    // factory returns the object based on some logic
    public AnimalDetails getRandomAnimal() {
        String options[] = {"CAT", "DOG", "ELEPHANT"};

        Random random = new Random();
        int r = random.nextInt(3);

        switch (options[r]) {
            case "CAT":
                return new Cat();

            case "DOG":
                return new Dog();

            case "ELEPHANT":
                return new Elephant();

            default:
                System.out.println("Error : Invalid switch option in AnimalFactory.java.");
                return null;
        }
    }

}
