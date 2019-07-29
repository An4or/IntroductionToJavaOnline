package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public class Region extends BaseCountry{
    private String regionName;
private static int id;
    public Region(double area, int numberInhabitants, String regionName) {
        super(area, numberInhabitants);
        this.regionName = regionName;
        id++;
    }

    public String getRegionName() {
        return regionName;
    }

    @Override
    public Region getRegion() {
        return null;
    }

    @Override
    public RegionalCenter getRegionalCenter() {
        return null;
    }

    @Override
    public City getCity() {
        return null;
    }

    public static int getId() {
        return id;
    }
}
