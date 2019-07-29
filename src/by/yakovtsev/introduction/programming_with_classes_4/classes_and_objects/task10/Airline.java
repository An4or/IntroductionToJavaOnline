package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airline {

    protected enum AircraftType {
        BOEING,
        AIRBUS
    }

//    protected enum DayOfWeek {
//         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }

    private String destination;
    private int flightNumber;
    private AircraftType aircraftType;
    private LocalTime timeDeparture;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, AircraftType aircraftType, LocalTime timeDeparture, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.timeDeparture = timeDeparture;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(LocalTime timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType=" + aircraftType +
                ", timeDeparture=" + timeDeparture +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
