package FactoryPattern.Animals;

public class Elephant extends AnimalDetails {

    public Elephant() {
        super.generateDetails("ELEPHANT");
    }

    @Override
    public String getDetails() {
        return super.toString();
    }

}
