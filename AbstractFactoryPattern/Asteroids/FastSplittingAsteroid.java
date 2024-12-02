package AbstractFactoryPattern.Asteroids;

import java.util.Random;

public class FastSplittingAsteroid extends Asteroid {

    public FastSplittingAsteroid() {
        Random random = new Random();
        int id = random.nextInt(200);
        String name = String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26)));
        int size = random.nextInt(400, 800);
        int xVelocity = random.nextInt(200, 900);
        int yVelocity = random.nextInt(200, 900);
        boolean isSplitAllowed = true;

        super(id, name, "FastSplittingAsteroid", size, xVelocity, yVelocity, isSplitAllowed);
    }

}
