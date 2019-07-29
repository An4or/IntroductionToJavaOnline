package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {
    List<Airline> airlineList = new ArrayList<>();

    public Airport(Airline airline) {
        airlineList.add(airline);
    }

    public Airport(Airline ... airlines){
        for (Airline airline: airlines){
            airlineList.add(airline);
        }
    }

    public void filterDestination(String destination){
        airlineList.stream().filter(x -> destination.equals(x.getDestination()))
                .forEach(System.out::println);
    }

    public void filterDayOfWeek(DayOfWeek dayOfWeek){
        airlineList.stream().filter(x -> dayOfWeek.equals(x.getDayOfWeek()))
                .forEach(System.out::println);
    }

    public void filterDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time){
        airlineList.stream().filter(x -> dayOfWeek.equals(x.getDayOfWeek()) && time.isBefore(x.getTimeDeparture()))
                .forEach(System.out::println);
    }


    public List<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

}
