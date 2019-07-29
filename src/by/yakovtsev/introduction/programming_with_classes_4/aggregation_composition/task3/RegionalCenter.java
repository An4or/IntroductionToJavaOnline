package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public class RegionalCenter extends BaseCountry {
    private String regionalCenterName;
    private Region region;

    public RegionalCenter( double area, int numberInhabitants, Region region, String regionalCenterName) {
        super( area, numberInhabitants);
        this.region = region;
        this.regionalCenterName = regionalCenterName;
    }



    public String getRegionalCenterName() {
        return regionalCenterName;
    }

    @Override
    public Region getRegion() {
        return region;
    }


}
