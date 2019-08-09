package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task2.abstract_factory;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarAudiFactotyImpl();
        Application app = new Application(factory);
        app.assemblyСar();
    }


}
