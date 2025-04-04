package entities;

public class Person {
    private final String gender;
    private final double height;

    public Person(String gender, double height) {
        this.gender = gender;
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }
}
