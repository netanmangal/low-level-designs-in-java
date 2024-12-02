package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Asteroids.*;

import java.util.HashMap;
import java.util.Random;

public class BalancedFactory implements AsteroidFactoryInterface {

    int sum = 0;
    HashMap<String, Integer> asteroidsGenerated = new HashMap<String, Integer>();

    @Override
    public Asteroid getAsteroid() throws Exception {
        Random random = new Random();
        String availableAsteroids[] = {"SmallAsteroid", "BigAsteroid", "SplittingAsteroid", "FastSplittingAsteroid"};

        String selectedAsteroid = null;

        while (selectedAsteroid == null) {
            selectedAsteroid = availableAsteroids[random.nextInt(availableAsteroids.length)];
            if (asteroidsGenerated.containsKey(selectedAsteroid)) {
                int timesAlreadyGenerated = asteroidsGenerated.get(selectedAsteroid);
                if (timesAlreadyGenerated > (sum / availableAsteroids.length) + 1) {
                    // regenerate
                    selectedAsteroid = null;
                }
            } else {
                asteroidsGenerated.put(selectedAsteroid, 1);
                sum += 1;
            }
        }

        return switch (selectedAsteroid) {
            case "SmallAsteroid" -> new SmallAsteroid();
            case "BigAsteroid" -> new BigAsteroid();
            case "SplittingAsteroid" -> new SplittingAsteroid();
            case "FastSplittingAsteroid" -> new FastSplittingAsteroid();
            default -> throw new Exception("Invalid asteroid to select.");
        };
    }

}
