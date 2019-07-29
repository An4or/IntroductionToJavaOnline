package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.builder;

public class CarBuilder implements Builder {
    private Brand brand;
    private Wheel wheel;
    private Engine engine;

    @Override
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(brand, wheel, engine);
    }
}
