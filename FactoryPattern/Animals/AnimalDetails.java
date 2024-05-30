package FactoryPattern.Animals;

import java.util.Random;

public abstract class AnimalDetails {

    private String animalID;
    private String type;
    private int age;

//    public AnimalDetails(String animalID, String type, int age) {
//        this.animalID = animalID;
//        this.type = type;
//        this.age = age;
//    }

    protected void generateDetails(String type) {
        Random random = new Random();
        String animalID = Integer.toString(random.nextInt(200));
        int age = random.nextInt(50);

        this.animalID = animalID;
        this.type = type;
        this.age = age;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return STR."AnimalDetails { animalID = '\{animalID}\{'\''}, type = '\{type}\{'\''}, age = \{age} \{'}'}";
    }

}
