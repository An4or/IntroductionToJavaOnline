package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.abstract_factory;

public class Application {
    private Wheel wheel;
    private Engine engine;

    public Application(CarFactory factory) {
        wheel = factory.createWheel();
        engine = factory.createEngine();

    }

    public void assemblyСar() {
        wheel.changeWheel();
        engine.refuel();
    }
}
