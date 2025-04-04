package entities;

public class Person {
    private final String name;
    private final double firstGrade;
    private final double secondGrade;
    private final double average;

    public Person(String name, double firstGrade, double secondGrade, double average) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public double getAverage() {
        return average;
    }

    public String toString() {
        return "Name: " + this.name + "\nfirstGrade: " + this.firstGrade + "\nsecondGrade: " + this.secondGrade + "\naverage: " + this.average;
    }
}
