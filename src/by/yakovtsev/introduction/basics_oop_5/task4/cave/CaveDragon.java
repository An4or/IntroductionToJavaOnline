package by.yakovtsev.introduction.basics_oop_5.task4.cave;

import by.yakovtsev.introduction.basics_oop_5.task4.treasure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class CaveDragon {
    private Treasure treasure;
    private List<Treasure> treasureList;

    public CaveDragon() {
        treasureList = new ArrayList<>();
        helpGaneratorTreasure();
    }

    public void showTreasure() {
        treasureList.forEach(System.out::println);
    }

    public void greatestTreasure() {
        double tmp = 0;
        for (Treasure treas : treasureList) {
            if (tmp < treas.getCost()) {
                tmp = treas.getCost();
            }
        }
        for (Treasure treas : treasureList) {
            if (tmp == treas.getCost()) {
                System.out.println(treas);
            }
        }
    }

    public void chooseTreasuresAmount(Double summ) {
        List<Treasure> treas = new ArrayList<>();
        treasureList.stream().sorted((x, y) -> (int) y.getCost() - (int) x.getCost());
        double tmp = 0;
        for (Treasure tr : treasureList) {
            if (tr.getCost() <= summ) {
                summ -= tr.getCost();
                treas.add(tr);
                tmp = summ;
            }
            if (summ == 0) {
                break;
            }
        }
        treas.stream().forEach(System.out::println);
//        if (tmp > 0) {
//            System.out.println("Fail ... Enter a different amount ");
//        } else {
//            treas.stream().forEach(System.out::println);
//        }
    }

    private void helpGaneratorTreasure() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = "treasure description" + i;
            if (i % 2 == 0) {
                treasureList.add(new TreasureCopper(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            } else if (i % 3 == 0) {
                treasureList.add(new TreasureSilver(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            } else {
                treasureList.add(new TreasureGold(randomEnum(TreasureType.class), name, random.nextInt(1000)));
            }
        }
    }

    private <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        Random random = new Random();
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
