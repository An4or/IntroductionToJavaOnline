package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructAudi(builder);

        Car car = builder.getResult();
        System.out.println("Car brand: " + car.getBrand());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructAudi(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        car.setFuel(20);
        car.setWheel(Wheel.SPORT);
        car.setRange(25);


    }


}
