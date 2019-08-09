package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

/*
* 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
* */
public class Main {

    public static void main(String[] args) {
        Airport airport = new Airport(
                new Airline("Moscow", 777, Airline.AircraftType.BOEING, LocalTime.of(22, 40), DayOfWeek.SATURDAY),
                new Airline("Paris", 444, Airline.AircraftType.BOEING, LocalTime.of(15, 00), DayOfWeek.SUNDAY),
                new Airline("Dubai", 555, Airline.AircraftType.BOEING, LocalTime.of(9, 40), DayOfWeek.SATURDAY),
                new Airline("Moscow", 888, Airline.AircraftType.BOEING, LocalTime.of(20, 00), DayOfWeek.SATURDAY),
                new Airline("Berlin", 999, Airline.AircraftType.BOEING, LocalTime.of(17, 20), DayOfWeek.FRIDAY)
        );

        System.out.println("Filter by destination");
        airport.filterDestination("Moscow");

        System.out.println("Filter by day of week");
        airport.filterDayOfWeek(DayOfWeek.SATURDAY);

        System.out.println("Filter by day of week and time");
        airport.filterDayOfWeekAndTime(DayOfWeek.SATURDAY, LocalTime.of(14, 00));
    }
}
