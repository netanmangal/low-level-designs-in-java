package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Asteroids.Asteroid;

public interface AsteroidFactoryInterface {

    Asteroid getAsteroid() throws Exception;

}
