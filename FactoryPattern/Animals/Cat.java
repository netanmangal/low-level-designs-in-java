package FactoryPattern.Animals;

import java.util.Random;

public class Cat extends AnimalDetails {

    public Cat() {
        super.generateDetails("CAT");
    }

    @Override
    public String getDetails() {
        return super.toString();
    }

}
