package AbstractFactoryPattern.Asteroids;

import java.util.Random;

public class SplittingAsteroid extends Asteroid {

    public SplittingAsteroid() {
        Random random = new Random();
        int id = random.nextInt(200);
        String name = String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26)));
        int size = random.nextInt(100, 2000);
        int xVelocity = random.nextInt(80, 400);
        int yVelocity = random.nextInt(80, 400);
        boolean isSplitAllowed = true;

        super(id, name, "SplittingAsteroid", size, xVelocity, yVelocity, isSplitAllowed);
    }

}
