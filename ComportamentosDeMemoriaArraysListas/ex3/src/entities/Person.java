package entities;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double heigth) {
        this.name = name;
        this.age = age;
        this.height = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nHeight: " + this.height;
    }
}
