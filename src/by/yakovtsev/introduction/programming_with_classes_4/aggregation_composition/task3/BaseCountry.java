package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public abstract class BaseCountry implements Country {
    private static final String COUNTRY = "Belarus";
    private static final String CAPITAL_CITY = "Minsk";
    private double area;
    private int numberInhabitants;
    private Region region;
    private RegionalCenter regionalCenter;
    private City city;

    public BaseCountry(double area, int numberInhabitants) {

        this.area = area;
        this.numberInhabitants = numberInhabitants;
    }

    public String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getCapitalCity() {
        return CAPITAL_CITY;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getNumberInhabitants() {
        return numberInhabitants;
    }

    public Region getRegion() {
        return region;
    }

    public RegionalCenter getRegionalCenter() {
        return regionalCenter;
    }

    public City getCity() {
        return city;
    }
}
