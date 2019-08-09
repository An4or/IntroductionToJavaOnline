package by.yakovtsev.introduction.basics_oop_5.task5.box;

import by.yakovtsev.introduction.basics_oop_5.task5.sweetness.Sweetness;

import java.util.List;

public class BoxSmall extends Box {
    private final double maxWeight = 3;
    private final double cost = 1;
    private final String typebox = "Small box";

    public BoxSmall(List<Sweetness> swt) {
        super(swt);
    }


    public String getTypeBox() {
        return typebox;
    }
    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCost() {
        return cost;
    }
}
