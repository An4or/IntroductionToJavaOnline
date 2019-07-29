package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList <TravelTour>travelTours = new ArrayList<>(Arrays.asList(
                new TravelTour("Tour info1", 500, 7, FoodType.BREAKFAST, TransportType.TRAIN),
                new TravelTour("Tour info2", 300, 5, FoodType.NONE, TransportType.BUS),
                new TravelTour("Tour info3", 500, 5, FoodType.BREAKFAST_AND_DINNER, TransportType.CAR),
                new TravelTour("Tour info4", 1200, 12, FoodType.ALL_INCLUSIVE, TransportType.PLANE),
                new TravelTour("Tour info5", 800, 9, FoodType.ALL_INCLUSIVE, TransportType.PLANE),
                new TravelTour("Tour info6", 700, 7, FoodType.DINNER, TransportType.SHIP),
                new TravelTour("Tour info7", 600, 6, FoodType.BREAKFAST_AND_DINNER, TransportType.TRAIN),
                new TravelTour("Tour info8", 1000, 15, FoodType.NONE, TransportType.PLANE)

        ));

        System.out.println("search by criteria");
        travelTours.stream()
                .filter(x -> x.getCostTour() <= 700 && (x.getFoodType().equals(FoodType.ALL_INCLUSIVE) || x.getFoodType().equals(FoodType.BREAKFAST_AND_DINNER)))
                .forEach(System.out::println);

        System.out.println("\nsort by cost");//
        travelTours.stream()
                .sorted((x,y) -> (int)x.getCostTour() - (int)y.getCostTour())
                .forEach(System.out::println);
    }


}
