## Low level designs in Java


### Liskov Substitution Principle : Children class objects must be substituent for the Parent class objects.

In other words, if we substitute a Parent class object reference with an object with any of it's subclass object, the program should not break.

### Example:

Consider parent class : `Vehicle`, and 2 classes `` and `` inherits from the `Vehicle` class.

```java
public class Vehicle {
    public int numberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}
```

```java
public class Bike extends Vehicle {}
```

```java
public class Car extends Vehicle {
    @Override
    public int numberOfWheels() {
        return 4;
    }
}
```

**Client Code:**
```java
public static void main(String args[]) {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Bike());
    vehicles.add(new Car());

    for (Vehicle v : vehicles) {
        System.out.println(v.hasEngine().toString());
    }
}
```

Here, if we introduce another Vehicle `Bicycle`, which has no engine, `Client code` will throw `NullPointerException` error at `Line 8`.

```java
public static class Bicycle extends Vehicle {
    @Override
    public Boolean hasEngine() {
        return null;
    }
}
```

**Client code:**
```java
public static void main(String args[]) {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Bike());
    vehicles.add(new Car());
    vehicles.add(new Bicycle());

    for (Vehicle v : vehicles) {
        System.out.println(v.hasEngine().toString());
    }
}
```

This is the violation of Liskov Substitution Principle.

### Solution

One needs to only keep the generic methods and attributes in the parent class. More specific methods, can be listed in the separate classes.

```java
public class Vehicle {
    public int numberOfWheels() {
        return 2;
    }
}
```

```java
public class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
}
```

```java
public class Bike extends EngineVehicle {}
```

```java
public class Car extends EngineVehicle {
    @Override
    public int numberOfWheels() {
        return 4;
    }
}
```

```java
public class Bicycle extends Vehicle {}
```

In this case, class `Bicycle` is extending from the parent class `Vehicle`, and we have a separate class `EngineVehicle` for the child objects which wish to have the function `hasEngine()`. 

**Client code #1:**
```java
public static void main(String args[]) {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    vehicles.add(new Bike());
    vehicles.add(new Car());
    vehicles.add(new Bicycle());

    for (Vehicle v : vehicles) {
        System.out.println(v.hasEngine().toString());
    }
}
```

Here, `hasEngine()` will give a compile time error, because Vehicle class is not having method `hasEngine()`. 

**Client code #2:**
```java
public static void main(String args[]) {
    List<EngineVehicle> engineVehicles = new ArrayList<EngineVehicle>();
    engineVehicles.add(new Bike());
    engineVehicles.add(new Car());
    engineVehicles.add(new Bicycle());

    for (EngineVehicle v : engineVehicles) {
        System.out.println(v.hasEngine().toString());
    }
}
```

This as well will give a compile time error because `new Bicycle()` doesn't inherit `EngineVehicle`. 

Here, the classes follow Liskov Substitution Principle because:
* `Bike` and `Car` class objects can be substituted for `Vehicle` class objects.
* `Bike` and `Car` class objects can be substituted for `EngineVehicle` class objects.
* `Bicycle` class objects can be substituted for `Vehicle` class objects.

Hence, each Child class object can substitute the object references of its Parent's class.

