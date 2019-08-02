package by.yakovtsev.introduction.basics_oop_5.task4.treasure;

public class TreasureSilver implements Treasure {
    private TreasureType treasureType;
    private String name;
    private double cost;

    public TreasureSilver(TreasureType treasureType, String name, int cost) {
        this.treasureType = treasureType;
        this.name = name;
        this.cost = cost * 2;
    }

    @Override
    public TreasureType getTreasureType() {
        return treasureType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "TreasureSilver{" +
                "treasureType=" + treasureType +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
