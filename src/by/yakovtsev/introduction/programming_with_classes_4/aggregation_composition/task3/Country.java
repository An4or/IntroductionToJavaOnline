package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public interface Country {
    String getCapitalCity();
    double getArea();
    int getNumberInhabitants();
    String getCountry();
    Region getRegion();
    RegionalCenter getRegionalCenter();
    City getCity();
}
