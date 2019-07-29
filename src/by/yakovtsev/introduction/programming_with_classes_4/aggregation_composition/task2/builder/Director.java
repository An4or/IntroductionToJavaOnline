package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.builder;

public class Director {
    public void constructAudi(Builder builder){
        builder.setBrand(Brand.AUDI);
        builder.setWheel(Wheel.ALLSEASON);
        builder.setEngine(new Engine(2.2, 0));
    }

    public void constructBMWSport(Builder builder){
        builder.setBrand(Brand.BMW);
        builder.setWheel(Wheel.SPORT);
        builder.setEngine(new Engine(5, 0));
    }
}
