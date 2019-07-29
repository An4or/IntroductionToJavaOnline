package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.abstract_factory;

public class EngineImpl implements Engine {
    @Override
    public void refuel() {
        System.out.println("gasoline fueled");
    }
}
