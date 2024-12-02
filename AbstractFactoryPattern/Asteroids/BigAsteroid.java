package AbstractFactoryPattern.Asteroids;

import java.util.Random;

public class BigAsteroid extends Asteroid {

    public BigAsteroid() {
        Random random = new Random();
        int id = random.nextInt(200);
        String name = String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26)));
        int size = random.nextInt(500, 3000);
        int xVelocity = random.nextInt(80, 400);
        int yVelocity = random.nextInt(80, 400);
        boolean isSplitAllowed = false;

        super(id, name, "BigAsteroid", size, xVelocity, yVelocity, isSplitAllowed);
    }

}
