package AbstractFactoryPattern;

import AbstractFactoryPattern.Asteroids.Asteroid;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {
        AsteroidConcreteFactory asteroidConcreteFactory = new AsteroidConcreteFactory();
        Asteroid asteroid;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the level between 1 to 10 : ");
        int level = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            asteroid = asteroidConcreteFactory.getAsteroid(level);
            System.out.println(STR."Asteroid selected is of type : \{asteroid.getType()} : \{asteroid}");
        }
    }

}
