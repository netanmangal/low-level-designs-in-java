package ProxyPattern;

public class Employee {

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    String name;
    String age;
    Gender gender;

    public Employee(String name, String age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
