package AbstractFactoryPattern;

import AbstractFactoryPattern.Asteroids.Asteroid;
import AbstractFactoryPattern.Factory.BalancedFactory;
import AbstractFactoryPattern.Factory.RandomFactory;

public class AsteroidConcreteFactory {

    RandomFactory randomFactory;
    BalancedFactory balancedFactory;

    public AsteroidConcreteFactory() {
        randomFactory = new RandomFactory();
        balancedFactory = new BalancedFactory();
    }

    public Asteroid getAsteroid(int level) throws Exception {
        if (level < 5) {
            return balancedFactory.getAsteroid();
        } else {
            return randomFactory.getAsteroid();
        }
    }

}
