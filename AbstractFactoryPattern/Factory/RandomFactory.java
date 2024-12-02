package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Asteroids.*;

import java.util.Random;

public class RandomFactory implements AsteroidFactoryInterface {

    @Override
    public Asteroid getAsteroid() throws Exception {
        Random random = new Random();
        String availableAsteroids[] = {"SmallAsteroid", "BigAsteroid", "SplittingAsteroid", "FastSplittingAsteroid"};

        String selectedAsteroid = availableAsteroids[random.nextInt(availableAsteroids.length)];

        return switch (selectedAsteroid) {
            case "SmallAsteroid" -> new SmallAsteroid();
            case "BigAsteroid" -> new BigAsteroid();
            case "SplittingAsteroid" -> new SplittingAsteroid();
            case "FastSplittingAsteroid" -> new FastSplittingAsteroid();
            default -> throw new Exception("Invalid asteroid to select.");
        };
    }

}
