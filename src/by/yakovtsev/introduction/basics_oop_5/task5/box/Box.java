package by.yakovtsev.introduction.basics_oop_5.task5.box;

import by.yakovtsev.introduction.basics_oop_5.task5.sweetness.Sweetness;

import java.util.ArrayList;
import java.util.List;

public abstract class Box {
    private List<Sweetness> sweetnessList = new ArrayList<>();

    public Box(Sweetness sweetness){
        sweetnessList.add(sweetness);
    }

    public Box(List<Sweetness> sweetness){
        sweetnessList.addAll(sweetness);
    }

    public abstract double getMaxWeight();
    public abstract double getCost();
    public abstract String getTypeBox();

    public void showInfoGift(){

        double cost = 0;
        double weight = 0;
        for (Sweetness sw: sweetnessList){

            cost += sw.getCost();
            weight += sw.getWeight();
        }
        System.out.println("The total weight of the gift: " + weight + "\n" +
                "The total cost of the gift: " + cost +
                " plus the price for the "+ getTypeBox() + " package: " + getCost()
        );
    }


}
