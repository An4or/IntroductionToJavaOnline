package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

import java.util.*;

public class CompoundCountry extends BaseCountry {
    protected List<Country> children = new ArrayList<>();

    public CompoundCountry(Country... components) {
        super( 0, 0);
        add(components);
    }

    public void add(Country component) {
        children.add(component);
    }

    public void add(Country... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Country child) {
        children.remove(child);
    }

    public void remove(Country... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public String getCountry() {
        return children.get(0).getCountry();
    }

    @Override
    public String getCapitalCity() {
        return children.get(0).getCapitalCity();
    }

    @Override
    public double getArea() {
        double area = 0;
        for (Country child : children) {
            area += child.getArea();
        }
        return area;
    }

    @Override
    public int getNumberInhabitants() {
        int inhabitants = 0;
        for (Country child : children) {
            inhabitants += child.getNumberInhabitants();
        }
        return inhabitants;
    }

    @Override
    public RegionalCenter getRegionalCenter() {
        Set<RegionalCenter> set = new HashSet<>();
        for (Country child : children) {
            set.add(child.getRegionalCenter());

        }
        for (RegionalCenter rc : set) {
            System.out.println(Arrays.toString(new String[]{rc.getRegionalCenterName()}));

        }

        return super.getRegionalCenter();
    }

    public void countRegions(){
        System.out.println("Count region = " + Region.getId());
    }
}
