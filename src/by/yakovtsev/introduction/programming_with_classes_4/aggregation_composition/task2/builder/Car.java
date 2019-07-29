package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.builder;

public class Car {
    private final Brand brand;
    private Wheel wheel;
    private final Engine engine;
    private double fuel = 0;
    private double range = 0;

    public Car(Brand brand, Wheel wheel, Engine engine) {
        this.brand = brand;
        this.wheel = wheel;
        this.engine = engine;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
        System.out.println("The car is filled with " + fuel + " liters");
    }

    public Brand getBrand() {
        return brand;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("Wheels replaced by " + wheel);
    }

    public Engine getEngine() {
        return engine;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
        System.out.println("The car drove " + range + " km");
    }
}
