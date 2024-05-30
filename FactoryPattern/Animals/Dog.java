package FactoryPattern.Animals;

public class Dog extends AnimalDetails {

    public Dog() {
        super.generateDetails("DOG");
    }

    @Override
    public String getDetails() {
        return super.toString();
    }

}
