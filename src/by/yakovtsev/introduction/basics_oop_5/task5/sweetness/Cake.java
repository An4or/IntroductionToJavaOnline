package by.yakovtsev.introduction.basics_oop_5.task5.sweetness;

public class Cake implements Sweetness {
    private final String name = "Cake";
    private final double cost = 7;
    private final double weight = 0.9;
    private int count;

    public Cake(int count) {
        this.count = count;
    }

    public Cake() {
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
        return "Cake{" +
                "name='" + name + '\'' +
                ", cost=" + getCost() +
                ", weight=" + getWeight() +
                ", count=" + count +
                '}';
    }
}
