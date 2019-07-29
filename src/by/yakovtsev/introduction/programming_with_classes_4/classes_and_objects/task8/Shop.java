package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Costomer> costomers = new ArrayList<>();

    public Shop(Costomer costomer) {
        costomers.add(costomer);
    }

    public Shop(Costomer ... costomer){
        for (Costomer c : costomer){
            costomers.add(c);
        }
    }

    public void sortCostomer(List<Costomer> list){
        Comparator<Costomer> comparator = Comparator.comparing(Costomer::getSurname)
                .thenComparing(Costomer::getName);

        list.stream().sorted(comparator).forEach(System.out::println);

    }

    public void filterCardNumber(long start, long finish){
        costomers.stream().filter(x -> x.getCardNumber() >= start && x.getCardNumber() <= finish)
                .forEach(System.out::println);
    }

    public List<Costomer> getCostomers() {
        return costomers;
    }

    public void setCostomers(List<Costomer> costomers) {
        this.costomers = costomers;
    }
}
