package by.yakovtsev.introduction.basics_oop_5.task5.box;

import by.yakovtsev.introduction.basics_oop_5.task5.sweetness.Sweetness;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(sweetnessList, box.sweetnessList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sweetnessList);
    }
}
