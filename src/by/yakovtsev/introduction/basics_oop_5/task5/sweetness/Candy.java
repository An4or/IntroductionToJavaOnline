package by.yakovtsev.introduction.basics_oop_5.task5.sweetness;

public class Candy implements Sweetness {
    private final String name = "Candy";
    private final double cost = 0.2;
    private final double weight = 0.05;
    private int count;

    public Candy(int count) {
        this.count = count;
    }

    public Candy() {
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
        return "Candy{" +
                "name='" + name + '\'' +
                ", cost=" + getCost() +
                ", weight=" + getWeight() +
                ", count=" + count +
                '}';
    }
}
