package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

public class CountryEditor {
    private CompoundCountry allCountry = new CompoundCountry();

    public void loadCountry(Country ... countries){
        allCountry.clear();
        allCountry.add(countries);
    }
}
