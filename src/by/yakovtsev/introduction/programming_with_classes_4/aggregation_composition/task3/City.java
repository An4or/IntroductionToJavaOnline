package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public class City extends BaseCountry {
    private String cityName;
    private Region region;
    private RegionalCenter regionalCenter;

    public City(double area, int numberInhabitants, Region region, RegionalCenter regionalCenter, String cityName) {
        super(area, numberInhabitants);
        this.region = region;
        this.regionalCenter = regionalCenter;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public Region getRegion() {
        return region;
    }

    @Override
    public RegionalCenter getRegionalCenter() {
        return regionalCenter;
    }
}
