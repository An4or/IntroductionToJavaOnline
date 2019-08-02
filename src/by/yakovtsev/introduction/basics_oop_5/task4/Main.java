package by.yakovtsev.introduction.basics_oop_5.task4;

import by.yakovtsev.introduction.ConsoleHelper;
import by.yakovtsev.introduction.basics_oop_5.task4.cave.CaveDragon;
import by.yakovtsev.introduction.basics_oop_5.task4.cave.CaveRedDragon;

public class Main {
    public static void main(String[] args) {
        CaveDragon dragon = new CaveRedDragon();
        int number = 0;
        do {
            System.out.println("1 <-- Treasure list \n" +
                    "2 <-- Finding the most expensive treasure \n" +
                    "3 <-- To find the treasure in a given amount \n" +
                    "0 <-- EXIT");

            number = ConsoleHelper.readInt();
            switch (number) {
                case (1):
                    dragon.showTreasure();
                    break;
                case (2):
                    dragon.greatestTreasure();
                    break;
                case (3):
                    System.out.println("Enter summy: ");
                    double summ = ConsoleHelper.readDouble();
                    dragon.chooseTreasuresAmount(summ);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }


        } while (number != 0);
        dragon.greatestTreasure();

    }
}
