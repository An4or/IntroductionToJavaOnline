package by.yakovtsev.introduction.basics_oop_5.task5.sweetness;

public class Chocolate implements Sweetness{
    private final String name = "Chocolate";
    private final double cost = 1.8;
    private final double weight = 0.1;
    private int count;

    public Chocolate(int count) {
        this.count = count;
    }

    public Chocolate() {
        this.count = 1;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost * count;
    }

    public double getWeight() {
        return weight * count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                ", cost=" + getCost() +
                ", weight=" + getWeight() +
                ", count=" + count +
                '}';
    }
}
