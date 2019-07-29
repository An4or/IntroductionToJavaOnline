package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.abstract_factory;

public class CarAudiFactotyImpl implements CarFactory {
    private String carBrand = "Audi";

    public CarAudiFactotyImpl() {
        getCarBrand();
        carRides();
    }

    public void carRides() {
        System.out.println("Car rides");
    }

    public void getCarBrand() {
        System.out.println("Car brand: " + carBrand);
    }

    @Override
    public Wheel createWheel() {
        return new WheelImpl();
    }

    @Override
    public Engine createEngine() {
        return new EngineImpl();
    }

}
