package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.builder;

public class Manual {
    private final Brand brand;
    private final Wheel wheel;
    private final Engine engine;

    public Manual(Brand brand, Wheel wheel, Engine engine) {
        this.brand = brand;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String print() {
        String info = "";
        info += "Brand car: " + brand + "\n";
        info += "Wheel is : " + wheel + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";

        return info;
    }
}
