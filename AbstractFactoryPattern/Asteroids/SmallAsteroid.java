package AbstractFactoryPattern.Asteroids;

import java.util.Random;

public class SmallAsteroid extends Asteroid {

    public SmallAsteroid() {
        Random random = new Random();
        int id = random.nextInt(200);
        String name = String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26))) + String.valueOf((char) ('a' + random.nextInt(26)));
        int size = random.nextInt(10, 300);
        int xVelocity = random.nextInt(30, 200);
        int yVelocity = random.nextInt(30, 200);
        boolean isSplitAllowed = false;

        super(id, name, "SmallAsteroid", size, xVelocity, yVelocity, isSplitAllowed);
    }

}
