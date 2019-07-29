package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task4;

import by.yakovtsev.introduction.ConsoleHelper;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

public class Train {
    private final String destination;
    private final int numberTrain;
    private final LocalDateTime dateTime;

    public Train(String destination, int numberTrain, LocalDateTime dateTime) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.dateTime = dateTime;
    }

    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("Brest", 1, LocalDateTime.of(2019, Month.AUGUST, 01, 10, 0)),
                new Train("Minsk", 2, LocalDateTime.of(2019, Month.AUGUST, 02, 20, 0)),
                new Train("Gomel", 3, LocalDateTime.of(2019, Month.AUGUST, 03, 15, 0)),
                new Train("Grodno", 4, LocalDateTime.of(2019, Month.AUGUST, 04, 20, 0)),
                new Train("Gomel", 3, LocalDateTime.of(2019, Month.AUGUST, 01, 20, 0)),
        };

//        for (Train train : trains) {
//            System.out.println(train.toString());
//        }
        infoTrain(trains);
    }

    public static void infoTrain(Train[] trains) {
        int number;
        do {
            System.out.println("Select an action from the menu: ");
            System.out.println("1 - Information on train number ");
            System.out.println("2 - Information on all trains ");
            System.out.println("0 - EXIT ");
            number = ConsoleHelper.readInt();
            switch (number) {
                case 1:
                    searchByNumber(trains);
                    break;
                case 2:
                    sortTrain(trains);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("You made a mistake when choosing the menu.\n");

            }
        } while (number != 0);
    }

    private static void searchByNumber(Train[] trains) {
        System.out.println("Enter train number");
        int number = ConsoleHelper.readInt();
        int count = 0;
        for (Train train : trains) {
            if (train.getNumberTrain() == number) {
                count++;
                System.out.println(train.toString());
            }
        }
        if (count == 0) {
            System.out.println("No train with this number");
        }
    }

    private static void sortTrain(Train[] trains) {
        Comparator<Train> destAndTime = Comparator.comparing(Train::getDestination).thenComparing(Train::getDateTime);
        Arrays.stream(trains)
                .sorted(destAndTime)
                .forEach(s -> System.out.println(s));
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", dateTime=" + dateTime +
                '}';
    }
}
