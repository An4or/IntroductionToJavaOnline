package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task3;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Main {

    public static void main(String[] args) {
        Region regionGomel = new Region(0, 0, "Gomel region");
        Region regionMinsk = new Region(0, 0, "Minsk region");
        Region regionBrest = new Region(0, 0, "Brest region");
        Region regionGrodno = new Region(0, 0, "Grodno region");

        RegionalCenter regionalCenterZhitkovichi = new  RegionalCenter(0, 0, regionGomel, "regional center of Zhitkovichi");
        RegionalCenter regionalCenterBaranovichi = new RegionalCenter(0, 0, regionMinsk, "regional center of Baranovichi");
        RegionalCenter regionalCenterGrodno = new RegionalCenter(0, 0, regionGrodno,"regional center of Grodno");
        RegionalCenter regionalCenterKobrin = new RegionalCenter(0, 0, regionBrest, "regional center of Kobrin");

        CompoundCountry compoundCountry = new CompoundCountry(


                new City( 15, 64000, regionGomel, regionalCenterZhitkovichi, "Tourov"),
                new City( 28, 90000, regionMinsk, regionalCenterBaranovichi, "Layhovichi"),
                new City( 19, 90000, regionGrodno, regionalCenterGrodno, "Skidel"),
                new City(13, 56000, regionBrest,regionalCenterKobrin, "Hidri"),
                new City( 17, 71000, regionBrest, regionalCenterKobrin, "Loza")
        );

        System.out.println("Country = " + compoundCountry.getCountry());
        System.out.println("Capital city = " + compoundCountry.getCapitalCity());
        System.out.println("Area = " + compoundCountry.getArea());
        System.out.println("Number Inhabitants = " + compoundCountry.getNumberInhabitants());
        compoundCountry.countRegions();
        compoundCountry.getRegionalCenter();
    }
}
